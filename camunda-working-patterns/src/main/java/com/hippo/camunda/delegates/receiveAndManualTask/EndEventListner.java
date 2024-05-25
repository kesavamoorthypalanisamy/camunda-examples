package com.hippo.camunda.delegates.receiveAndManualTask;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;
import jakarta.inject.Named;

@Named("reveive_and_manual_end")
public class EndEventListner implements ExecutionListener{

    @Override
    public void notify(DelegateExecution execution) throws Exception {
        System.out.println("reveive_and_manual_end for :"+execution.getBusinessKey());
    }

}
