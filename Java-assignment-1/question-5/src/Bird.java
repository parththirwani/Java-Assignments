public class Bird extends Animal {
    private double wingspan;
    private boolean canFly;
    
    public Bird(String name, int age, String species, double wingspan, boolean canFly) {
        super(name, age, species);
        this.wingspan = wingspan;
        this.canFly = canFly;
    }
    
    @Override
    public void makeSound() {
        System.out.println(name + " chirps: Tweet tweet!");
    }
    
    @Override
    public void move() {
        if (canFly) {
            System.out.println(name + " is flying through the air");
        } else {
            System.out.println(name + " is hopping around");
        }
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Wingspan: " + wingspan + " cm");
        System.out.println("Can Fly: " + (canFly ? "Yes" : "No"));
    }
}