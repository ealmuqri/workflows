import workflow_core.*;
import workflow_runner.WorkflowRunner;

public class main {
    public static void main(String[] args){
        /*
        initializing the workflow instance
         */
        Workflow workflowInstance = new Workflow("123","first Workflow");
        Rule emptyRule = new EmptyRule("r123","emptyRule");
        Step step1 = new Step("s1","step1",StepType.Human);



        WorkflowRunner workflowRunner = new WorkflowRunner();
        workflowRunner.executeNextStep(workflowInstance);


    }
}
