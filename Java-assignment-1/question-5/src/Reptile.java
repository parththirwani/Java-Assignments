public class Reptile extends Animal {
    private boolean isVenomous;
    private String scalePattern;
    
    public Reptile(String name, int age, String species, boolean isVenomous, String scalePattern) {
        super(name, age, species);
        this.isVenomous = isVenomous;
        this.scalePattern = scalePattern;
    }
    
    @Override
    public void makeSound() {
        System.out.println(name + " hisses: Sssssss!");
    }
    
    @Override
    public void move() {
        System.out.println(name + " slithers on the ground");
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Venomous: " + (isVenomous ? "Yes" : "No"));
        System.out.println("Scale Pattern: " + scalePattern);
    }
}