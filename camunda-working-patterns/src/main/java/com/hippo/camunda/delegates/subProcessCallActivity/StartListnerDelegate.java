package com.hippo.camunda.delegates.subProcessCallActivity;

import java.util.List;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;
import org.camunda.bpm.engine.delegate.Expression;
import jakarta.inject.Named;
import lombok.extern.slf4j.Slf4j;

@Named("callActivityStartEvent")
@Slf4j
public class StartListnerDelegate implements ExecutionListener {

    Expression injField1;
    @Override
    public void notify(DelegateExecution execution) throws Exception {
        execution.setVariable("DocList", List.of("a", "b", "c"));
        log.info("Injected value: {}",injField1.getExpressionText());
    }
    
}
