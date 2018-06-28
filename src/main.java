import workflow_core.*;
import workflow_runner.WorkflowRunner;

public class main {
    public static void main(String[] args) {
        /*
        initializing the workflow instance
         */
        Workflow workflowInstance = new Workflow("123", "first Workflow");
        RuleContract emptyRule = new EmptyRule("r123", "emptyRule");
        Step step1 = new Step("s1", "step1", StepType.Human);
        step1.addRule(emptyRule);
        step1.addPostRunRule(emptyRule);
        step1.addPreRunRule(emptyRule);
        workflowInstance.addStep(step1);


        WorkflowRunner workflowRunner = new WorkflowRunner();
        workflowRunner.executeCurrentStep(workflowInstance);


    }
}
