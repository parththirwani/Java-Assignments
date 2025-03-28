public class Manager extends Employee {
    private int teamSize;
    private double allowance;
    
    public Manager(String name, String id, double baseSalary, 
                  int teamSize, double allowance) {
        super(name, id, baseSalary);
        this.teamSize = teamSize;
        this.allowance = allowance;
    }
    
    @Override
    public double calculateSalary() {
        return getBaseSalary() + allowance + (teamSize * 100); // $100 per team member bonus
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Role: Manager");
        System.out.println("Team Size: " + teamSize);
        System.out.println("Allowance: $" + allowance);
        System.out.println("------------------------");
    }
}