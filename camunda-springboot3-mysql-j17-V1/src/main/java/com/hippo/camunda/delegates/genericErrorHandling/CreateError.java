package com.hippo.camunda.delegates.genericErrorHandling;

import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import jakarta.inject.Named;
import lombok.extern.slf4j.Slf4j;

@Named("createError")
@Slf4j
public class CreateError implements JavaDelegate{

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        if (execution.getBusinessKey().equals("test_error_400")) {
            throw new BpmnError("error-boundry-errormessage_400", "Sample error");
        }else if (execution.getBusinessKey().equals("test_error_500")) {
            throw new BpmnError("error-boundry-errormessage_500", "Sample error");
        }
        log.info("sucessfully pass through err creator");
    }
    
}
