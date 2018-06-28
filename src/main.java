import workflow_core.*;
import workflow_rules.AttendenceRules;
import workflow_rules.EmptyRule;
import workflow_rules.Rule;
import workflow_rules.SalaryRules;
import workflow_runner.WorkflowRunner;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        /*
        initializing the workflow instance
         */
        Workflow workflowInstance = new Workflow("123", "first Workflow");
        Rule emptyRule = new EmptyRule("r123", "emptyRule");
        Rule attendenceRule = new AttendenceRules("r1123", "Attendence Rules");
        Rule salaryRule = new SalaryRules("r3213","Salary Rules");
        //((AttendenceRules) attendenceRule).executeMethods();
        List<String> methods = new ArrayList<String>();
        List<Object> workflowData = new ArrayList<Object>();
        methods.add("sampleMethod");
        workflowData.add("Essam");
        attendenceRule.executeRules(methods,workflowData);
        // I don't want to end up creating 1000 classes for my rules!
        /*
        OPTIONS:
        1. Create generic rules for Math, Dates, Strings ..etc and have them adhere to the interface.
        2. Have one Big Rules file and let the invoker define what functions required to run in order.
        3.
         */

        Step step1 = new Step("s1", "step1", StepType.Human);
        step1.addRule(attendenceRule);
        step1.addPostRunRule(emptyRule);
        step1.addPreRunRule(salaryRule);
        workflowInstance.addStep(step1);


        WorkflowRunner workflowRunner = new WorkflowRunner();
        workflowRunner.executeCurrentStep(workflowInstance);


    }
}
