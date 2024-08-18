package com.hippo.camunda.delegates.multiInstanceExpandedSubProcess;

import java.util.List;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import jakarta.inject.Named;

@Named("makePositive")
public class MakeLineItemValuePositive implements JavaDelegate{

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        System.out.println("Making line item positive");
        Integer itemValue = (Integer) execution.getVariable("lineItem");
        System.out.println("current item: " + itemValue);
        System.out.println("--------------------------------------------------------");
        List<Integer> lineItems = (List<Integer>) execution.getVariable("lineItems");
        execution.setVariable("lineItems", lineItems);
        lineItems.forEach(System.out::println);
    }

}
