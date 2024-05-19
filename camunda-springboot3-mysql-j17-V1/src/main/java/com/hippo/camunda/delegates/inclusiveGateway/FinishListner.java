package com.hippo.camunda.delegates.inclusiveGateway;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;
import jakarta.inject.Named;

@Named("finishInclusiveExample")
public class FinishListner implements ExecutionListener{

    @Override
    public void notify(DelegateExecution execution) throws Exception {
        Long t = (Long) execution.getVariable("t");
        System.out.println("finish Inclusive Example invoked for : " + t);
    }
}
