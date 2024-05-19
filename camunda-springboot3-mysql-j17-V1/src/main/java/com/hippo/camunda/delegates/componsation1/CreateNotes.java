package com.hippo.camunda.delegates.componsation1;

import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import jakarta.inject.Named;
import lombok.extern.slf4j.Slf4j;

@Named("createNotes")
@Slf4j
public class CreateNotes implements JavaDelegate{


    @Override
    public void execute(DelegateExecution execution) throws Exception {
        String name = (String) execution.getVariable("name");
        log.info("creating notes for : {} ", name);
        if (name.equals("err")) {
            throw new BpmnError("ERR_NOTE");
        }
        log.info("Notes created for : {}",name);
    }
    
}
