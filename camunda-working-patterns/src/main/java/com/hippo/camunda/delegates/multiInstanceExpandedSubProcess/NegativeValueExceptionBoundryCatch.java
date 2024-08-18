package com.hippo.camunda.delegates.multiInstanceExpandedSubProcess;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import jakarta.inject.Named;

@Named("negativeValueExceptionBoundryCatch")
public class NegativeValueExceptionBoundryCatch implements JavaDelegate{

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        System.out.println("Catch negative value at boundry");
    }

}
