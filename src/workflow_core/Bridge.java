package workflow_core;

public class Bridge {
    private String ID;
    private String name;
    private RuleContract[] bridgeRuleContracts;
    private RuleContract[] preRunRuleContracts;
    private RuleContract[] postRunRuleContracts;
    private Path[] paths;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RuleContract[] getBridgeRuleContracts() {
        return bridgeRuleContracts;
    }

    public void setBridgeRuleContracts(RuleContract[] bridgeRuleContracts) {
        this.bridgeRuleContracts = bridgeRuleContracts;
    }

    public RuleContract[] getPreRunRuleContracts() {
        return preRunRuleContracts;
    }

    public void setPreRunRuleContracts(RuleContract[] preRunRuleContracts) {
        this.preRunRuleContracts = preRunRuleContracts;
    }

    public RuleContract[] getPostRunRuleContracts() {
        return postRunRuleContracts;
    }

    public void setPostRunRuleContracts(RuleContract[] postRunRuleContracts) {
        this.postRunRuleContracts = postRunRuleContracts;
    }

    public Path[] getPaths() {
        return paths;
    }

    public void setPaths(Path[] paths) {
        this.paths = paths;
    }
}
