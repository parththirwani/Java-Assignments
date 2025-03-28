public class Animal {
    protected String name;
    protected int age;
    protected String species;
    
    public Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }
    
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
    
    public void move() {
        System.out.println("Animal is moving");
    }
    
    public void displayInfo() {
        System.out.println("\nAnimal Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Species: " + species);
    }
}