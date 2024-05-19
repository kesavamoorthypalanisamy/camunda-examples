package com.hippo.bpm.client;

import org.camunda.bpm.client.spring.annotation.ExternalTaskSubscription;
import org.camunda.bpm.client.task.ExternalTask;
import org.camunda.bpm.client.task.ExternalTaskHandler;
import org.camunda.bpm.client.task.ExternalTaskService;
import org.camunda.bpm.engine.variable.VariableMap;
import org.camunda.bpm.engine.variable.Variables;
import org.springframework.stereotype.Component;

@Component
@ExternalTaskSubscription("eligibilityCheck")
public class LoanEligibilityHandler implements ExternalTaskHandler {

    @Override
    public void execute(ExternalTask extTask, ExternalTaskService externalTaskService) {
        String name = extTask.getVariable("name");
        long age = extTask.getVariable("age");
        long loanAmount = extTask.getVariable("loanAmount");
        String purpose = extTask.getVariable("purpose");
        String email = extTask.getVariable("email");
        String status = "";
        String rejectReason = "";

        System.out.println("name" + name);
        System.out.println("age" + age);
        System.out.println("loanAmount" + loanAmount);
        System.out.println("purpose" + purpose);
        System.out.println("email" + email);
        System.out.println("status" + status);
        System.out.println("rejectReason" + rejectReason);

        if (loanAmount < 100000) {
            status = "Rejected";
            rejectReason = "We are not approving loans less than 100000";

        } else {

            status = "Approved";
        }

        VariableMap variables = Variables.createVariables();
        variables.put("status", status);
        variables.put("rejectReason", rejectReason);

        externalTaskService.complete(extTask, variables);
    }

}
