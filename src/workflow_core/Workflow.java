package workflow_core;

import java.util.ArrayList;
import java.util.List;

public class Workflow {
    private String ID;
    private String name;
    private String description;
    private List<Step> steps = new ArrayList<>();
    private List<Bridge> bridges = new ArrayList<>();
    private List<Object> workflowData = new ArrayList<>();
    private Step currentStep;

    public Workflow(String ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public List<Step> getSteps() {
        return steps;
    }

    public void setSteps(List<Step> steps) {
        this.steps = steps;
    }

    public List<Bridge> getBridges() {
        return bridges;
    }

    public void setBridges(List<Bridge> bridges) {
        this.bridges = bridges;
    }

    public List<Object> getWorkflowData() {
        return workflowData;
    }

    public void setWorkflowData(List<Object> workflowData) {
        this.workflowData = workflowData;
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

    public String getDescription() {
        return description;
    }

    public Step getCurrentStep() {
        return currentStep;
    }

    public void setCurrentStep(Step currentStep) {
        this.currentStep = currentStep;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public void addStep(Step step) {
        this.steps.add(step);
        if (this.currentStep == null) {
            currentStep = step;
        }
    }

    public void addBridge(Bridge bridge) {
        this.bridges.add(bridge);
    }

}
