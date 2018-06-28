package workflow_core;

public class EmptyRule extends Rule implements RuleContract {

    @Override
    public boolean executeRules() {
        System.out.println("Rule Executed");
        return true;
    }


    public EmptyRule(String ID, String name) {
        this.ID = ID;
        this.name = name;
    }
}
