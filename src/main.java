import workflow_core.*;
import workflow_rules.AttendanceRules;
import workflow_rules.EmptyRule;
import workflow_rules.Rule;
import workflow_rules.SalaryRules;
import workflow_runner.WorkflowRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class main {
    public static void main(String[] args) {
        /*
        initializing the workflow instance
         */
        //Workflow workflowInstance = new Workflow("123", "first Workflow");
        Workflow workflowInstance = new Workflow();
        workflowInstance = workflowInstance.contructWorkflow("w123","Workflow NAme");


        WorkflowRunner workflowRunner = new WorkflowRunner();
        workflowRunner.executeCurrentStep(workflowInstance);


    }
}
