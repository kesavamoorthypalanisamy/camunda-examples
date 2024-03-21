package com.hippo.camunda.configuration;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.spring.boot.starter.event.PostDeployEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class BpmnAutoStart {
    private final RuntimeService runtimeService;
    
  // @EventListener
  // public void processPostDeploy(PostDeployEvent event) {
  //   runtimeService.startProcessInstanceByKey("Process_0l1k9dx");
  // }
    
}
