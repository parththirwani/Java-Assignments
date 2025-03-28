public class Employee extends Person {
    int id;

    public Employee(String name, int id) {
        super(name); // Using 'super' to call the parent class constructor
        this.id = id; // Using 'this' to refer to the current class instance variable
    }

    public void showDetails() {
        super.display(); // Calling the parent class method using 'super'
        System.out.println("Employee ID: " + this.id); // Using 'this' explicitly
    }
}