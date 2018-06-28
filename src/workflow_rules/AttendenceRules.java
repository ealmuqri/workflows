package workflow_rules;

public class AttendenceRules implements Rule {
    private String id, name;

    public AttendenceRules(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean executeRules() {
        System.out.println("==== Attendence Rules ====");
        System.out.println("Rule1: Checking Employee Attendence");
        System.out.println("-- Success");
        System.out.println("Rule2: Checking Employee Abcense");
        System.out.println("-- Success");
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
