package com.hippo.camunda.delegates.componsation1;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import jakarta.inject.Named;
import lombok.extern.slf4j.Slf4j;

@Named("deleteLineItemComponsation")
@Slf4j
public class DeleteLineItemComponsation implements JavaDelegate{

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        String name = (String) execution.getVariable("name");
        log.info("Delete Line items in componsation for : {} ",name);
    }
    
}
