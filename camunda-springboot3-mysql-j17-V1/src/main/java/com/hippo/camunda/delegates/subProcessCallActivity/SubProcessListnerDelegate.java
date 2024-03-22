package com.hippo.camunda.delegates.subProcessCallActivity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import jakarta.inject.Named;
import lombok.extern.slf4j.Slf4j;

@Named("subProcessListner")
@Slf4j
public class SubProcessListnerDelegate implements JavaDelegate{


    @Override
    public void execute(DelegateExecution execution) throws Exception {
        Object variable = execution.getVariable("SubDocList");
        if (variable != null) {
            List<String> subDocList = new ArrayList<>((Collection<String>) variable);
            log.info(subDocList.toString());
        }
    }
    
}
