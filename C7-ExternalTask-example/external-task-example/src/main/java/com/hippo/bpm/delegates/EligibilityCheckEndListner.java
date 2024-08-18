package com.hippo.bpm.delegates;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import jakarta.inject.Named;

@Named("eligibilityCheck")
public class EligibilityCheckEndListner implements JavaDelegate{

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        String status = (String) execution.getVariable("status");
        System.out.println("eligibilityCheck end status: "+status);
    }
    
}
