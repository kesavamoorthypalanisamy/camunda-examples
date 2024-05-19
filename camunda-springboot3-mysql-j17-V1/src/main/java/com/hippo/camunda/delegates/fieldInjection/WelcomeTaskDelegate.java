package com.hippo.camunda.delegates.fieldInjection;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.Expression;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import jakarta.inject.Named;

@Named("welcome")
public class WelcomeTaskDelegate implements JavaDelegate {
    private Expression greetingMessage;

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        System.out.println("Welcome task delegete: -->");
        System.out.println(greetingMessage.getValue(execution));
    }
    
}
