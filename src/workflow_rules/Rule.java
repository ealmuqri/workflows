package workflow_rules;

public interface Rule {
    public boolean executeRules();
    public String getRuleName();
    public String getRuleId();

}
