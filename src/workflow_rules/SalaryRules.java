package workflow_rules;

public class SalaryRules implements Rule{
    private String id, name;

    public SalaryRules(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean executeRules() {
        System.out.println("==== Salary Rules ====");
        System.out.println("Rule1: Checking Employee Salary?");
        System.out.println("-- Success");
        System.out.println("Rule2: Checking Employee has enough money?");
        System.out.println("-- Success");
        System.out.println("Rule3: Checking Employee has loans?");
        System.out.println("-- Failure");
        return false;
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
