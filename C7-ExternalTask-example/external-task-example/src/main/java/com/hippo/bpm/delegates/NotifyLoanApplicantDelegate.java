package com.hippo.bpm.delegates;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import jakarta.inject.Named;

@Named("notifyApplicant")
public class NotifyLoanApplicantDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        String email=(String) execution.getVariable("email");
        String status=(String) execution.getVariable("status");
        String rejectReason=(String) execution.getVariable("rejectReason");

        System.out.println("email"+email);
        System.out.println("status"+status);
        System.out.println("rejectReason"+rejectReason);
    }
    
}
