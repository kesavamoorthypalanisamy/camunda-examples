package com.hippo.camunda.delegates.multiInstanceExpandedSubProcess;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import jakarta.inject.Named;

@Named("printValue")
public class PrintProgressValue implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        Integer itemValue = (Integer) execution.getVariable("lineItem");
        System.out.println("Executing lineItem --> " + itemValue);
    }
    

}
