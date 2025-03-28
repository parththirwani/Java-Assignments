public class Mammal extends Animal {
    private String furColor;
    private boolean isNocturnal;
    
    public Mammal(String name, int age, String species, String furColor, boolean isNocturnal) {
        super(name, age, species);
        this.furColor = furColor;
        this.isNocturnal = isNocturnal;
    }
    
    @Override
    public void makeSound() {
        if (species.equalsIgnoreCase("Lion")) {
            System.out.println(name + " roars: ROAR!");
        } else if (species.equalsIgnoreCase("Wolf")) {
            System.out.println(name + " howls: HOOOWL!");
        }
    }
    
    @Override
    public void move() {
        System.out.println(name + " is running on four legs");
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Fur Color: " + furColor);
        System.out.println("Nocturnal: " + (isNocturnal ? "Yes" : "No"));
    }
}