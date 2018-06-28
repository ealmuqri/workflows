package workflow_core;

import java.util.ArrayList;
import java.util.List;

public class Step {

    private String ID;
    private String name;
    private StepType stepType;
    private List<RuleContract> rules = new ArrayList<>();
    private List<RuleContract> preRunRules = new ArrayList<>();
    private List<RuleContract> postRunRules = new ArrayList<>();
    private Role[] roles;
    private Boolean isBlocker;
    private Step defaultDestination;

    public Step(String ID, String name, StepType stepType) {
        this.ID = ID;
        this.name = name;
        this.stepType = stepType;

    }

    public void runStep() {
        /*
            1. Run Pre Run Rules.
            2. Run Rules.
            3. Run Post Run Rules
            4. Fire Conclusion Event.
         */
        for (RuleContract ruleContract : preRunRules) {
            ruleContract.executeRules();
        }
        for (RuleContract ruleContract : rules) {
            ruleContract.executeRules();
        }
        for (RuleContract ruleContract : postRunRules) {
            ruleContract.executeRules();
        }

        /*
        TODO:
        Dispatch an event anyone interested. (Pub-Sub Model)
         */
    }

    public void addRule(RuleContract rule) {
        this.rules.add(rule);
    }

    public void addPreRunRule(RuleContract rule) {
        this.preRunRules.add(rule);
    }

    public void addPostRunRule(RuleContract rule) {
        this.postRunRules.add(rule);
    }


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

    public StepType getStepType() {
        return stepType;
    }

    public void setStepType(StepType stepType) {
        this.stepType = stepType;
    }

    public List<RuleContract> getRules() {
        return rules;
    }

    public void setRules(List<RuleContract> rules) {
        this.rules = rules;
    }

    public List<RuleContract> getPreRunRules() {
        return preRunRules;
    }

    public void setPreRunRules(List<RuleContract> preRunRules) {
        this.preRunRules = preRunRules;
    }

    public List<RuleContract> getPostRunRules() {
        return postRunRules;
    }

    public void setPostRunRules(List<RuleContract> postRunRules) {
        this.postRunRules = postRunRules;
    }

    public Role[] getRoles() {
        return roles;
    }

    public void setRoles(Role[] roles) {
        this.roles = roles;
    }

    public Boolean getBlocker() {
        return isBlocker;
    }

    public void setBlocker(Boolean blocker) {
        isBlocker = blocker;
    }

    public Step getDefaultDestination() {
        return defaultDestination;
    }

    public void setDefaultDestination(Step defaultDestination) {
        this.defaultDestination = defaultDestination;
    }
}
