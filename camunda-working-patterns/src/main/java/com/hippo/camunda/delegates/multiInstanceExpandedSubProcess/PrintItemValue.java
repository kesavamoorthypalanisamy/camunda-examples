package com.hippo.camunda.delegates.multiInstanceExpandedSubProcess;

import java.util.List;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import jakarta.inject.Named;

@Named("printItemValue")
public class PrintItemValue implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        List<Integer> lineItems = (List<Integer>) execution.getVariable("lineItems");
        lineItems.forEach(System.out::println);
    }

}
