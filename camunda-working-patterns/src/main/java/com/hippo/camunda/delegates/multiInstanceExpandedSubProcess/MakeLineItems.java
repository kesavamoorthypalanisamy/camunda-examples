package com.hippo.camunda.delegates.multiInstanceExpandedSubProcess;

import java.util.ArrayList;
import java.util.List;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import jakarta.inject.Named;

@Named("makeLineItems")
public class MakeLineItems implements JavaDelegate{

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        Integer businessKey = Integer.valueOf(execution.getBusinessKey());
        List<Integer> lineItems = new ArrayList<>();
        lineItems.add(10);
        lineItems.add(0);
        lineItems.add(-1);
        lineItems.add(14);
        // Stream.iterate(businessKey, n -> n + 1).limit(5).forEach(i -> lineItems.add(i));
        execution.setVariable("lineItems", lineItems);
    }

}
