package workflow_core;

import workflow_rules.Rule;

public class Bridge {
    private String ID;
    private String name;
    private Rule[] bridgeRules;
    private Rule[] preRunRules;
    private Rule[] postRunRules;
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

    public Rule[] getBridgeRules() {
        return bridgeRules;
    }

    public void setBridgeRules(Rule[] bridgeRules) {
        this.bridgeRules = bridgeRules;
    }

    public Rule[] getPreRunRules() {
        return preRunRules;
    }

    public void setPreRunRules(Rule[] preRunRules) {
        this.preRunRules = preRunRules;
    }

    public Rule[] getPostRunRules() {
        return postRunRules;
    }

    public void setPostRunRules(Rule[] postRunRules) {
        this.postRunRules = postRunRules;
    }

    public Path[] getPaths() {
        return paths;
    }

    public void setPaths(Path[] paths) {
        this.paths = paths;
    }
}
