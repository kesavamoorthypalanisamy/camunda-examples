package com.hippo.camunda.delegates.linkEvent;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import jakarta.inject.Named;

@Named("op2")
public class Operation2Delegate implements JavaDelegate{

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        System.out.println("operation2 !!");
    }

}
