public class Main {
    public static void main(String[] args) {
        // Creating array of Employee objects (Polymorphism)
        Employee[] employees = new Employee[3];
        
        // Initializing with different types of employees
        employees[0] = new Developer("John Smith", "DEV001", 70000, "Java", 5000);
        employees[1] = new Manager("Jane Doe", "MGR001", 90000, 5, 10000);
        employees[2] = new Developer("Bob Wilson", "DEV002", 65000, "Python", 4000);
        
        // Polymorphic behavior - same method call, different implementations
        System.out.println("Employee Details:");
        System.out.println("------------------------");
        for (Employee emp : employees) {
            emp.displayInfo();  // Will call the appropriate overridden method
        }
    }
}