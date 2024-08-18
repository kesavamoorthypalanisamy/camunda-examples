package com.hippo.camunda.delegates.linkEvent;

import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import jakarta.inject.Named;

@Named("task1")
public class Task1Delegate implements JavaDelegate{

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        String businessKey = execution.getBusinessKey();
        if (businessKey.equals("op1")) {
            throw new BpmnError("Error_1");
        } else if (businessKey.equals("op2")) {
            throw new BpmnError("Error_2");
        }

        System.out.println("Regular completion - task1 !!"); 
    }

}
