package com.hippo.camunda.delegates.multiInstanceServiceTask;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import jakarta.inject.Named;

@Named("processLineItems")
public class ProcessLineItems implements JavaDelegate{

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        System.out.println("currently executing: "+execution.getVariable("lineItem").toString());
    }

}
