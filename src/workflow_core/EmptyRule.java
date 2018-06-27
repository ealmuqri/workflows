package workflow_core;

public class EmptyRule extends Rule implements RuleContract {

    @Override
    public boolean executeRules() {
        return true;
    }


    public EmptyRule(String ID, String name) {
        this.ID=ID;
        this.name=name;
    }
}
