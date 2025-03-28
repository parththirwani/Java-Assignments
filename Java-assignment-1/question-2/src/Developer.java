public class Developer extends Employee {
    private String programmingLanguage;
    private double bonus;
    
    public Developer(String name, String id, double baseSalary, 
                    String programmingLanguage, double bonus) {
        super(name, id, baseSalary);
        this.programmingLanguage = programmingLanguage;
        this.bonus = bonus;
    }
    
    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Role: Developer");
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println("Bonus: $" + bonus);
        System.out.println("------------------------");
    }
}