package workflow_runner;

import workflow_core.Workflow;

public class WorkflowRunner {

    public void executeNextStep(Workflow workflow) {
        workflow.getCurrentStep().runStep();
    }

    public void executeCurrentStep(Workflow workflow) {
        workflow.getCurrentStep().runStep();
    }
}
