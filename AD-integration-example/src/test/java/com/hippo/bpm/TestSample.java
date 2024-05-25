package com.hippo.bpm;

import static org.camunda.bpm.engine.test.assertions.bpmn.BpmnAwareTests.assertThat;
import static org.camunda.bpm.engine.test.assertions.bpmn.BpmnAwareTests.complete;
import static org.camunda.bpm.engine.test.assertions.bpmn.BpmnAwareTests.runtimeService;
import static org.camunda.bpm.engine.test.assertions.bpmn.BpmnAwareTests.task;
import static org.camunda.bpm.engine.test.assertions.bpmn.BpmnAwareTests.withVariables;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.camunda.bpm.engine.test.Deployment;
import org.camunda.bpm.engine.test.ProcessEngineRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestSample {
    private static final String PROCESS_KEY_1 = "my-project-1-process";

    @Rule
    public ProcessEngineRule rule = new ProcessEngineRule();

    @Test
    @Deployment(resources = {"process.bpmn"})
    public void test_process1_happyPath_e2e() {
        ProcessInstance instance = runtimeService().startProcessInstanceByKey(PROCESS_KEY_1);
        assertThat(instance).isActive().hasPassed("StartEvent_1").isWaitingAtExactly("say-hello")
                .task().isNotAssigned();

        complete(task(), withVariables("assignPerson", "test user"));

        assertThat(instance).hasPassed("say-hello").hasPassedInOrder("say-hello", "serviceTask1")
                .isWaitingAt("userTask2").task().isAssignedTo("test user");

        complete(task(), withVariables("attributeService", "variableServicevalue"));
        assertThat(instance).hasPassedInOrder("userTask2", "endEvent").isEnded();

    }

}
