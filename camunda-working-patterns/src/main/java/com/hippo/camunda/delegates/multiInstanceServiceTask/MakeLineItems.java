package com.hippo.camunda.delegates.multiInstanceServiceTask;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import jakarta.inject.Named;

@Named("initLineItems")
public class MakeLineItems implements JavaDelegate{

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        Integer businessKey = Integer.valueOf(execution.getBusinessKey());
        execution.setVariable("haveAnyNegativeValue", businessKey<0);
        List<Integer> lineItems = new ArrayList<>();
        Stream.iterate(businessKey, n -> n + 1).limit(5).forEach(i -> lineItems.add(i));
        execution.setVariable("lineItems", lineItems);
    }

}
