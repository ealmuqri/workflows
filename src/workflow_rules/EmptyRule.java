package workflow_rules;

public class EmptyRule implements Rule {
    private String id, name;

    public EmptyRule(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean executeRules() {
        System.out.println("Rule Executed");
        return true;
    }

    @Override
    public String getRuleName() {
        return name;
    }

    @Override
    public String getRuleId() {
        return id;
    }


}
