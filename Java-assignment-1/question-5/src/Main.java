public class Main {
    public static void main(String[] args) {
        // Creating an array of Animal objects (Polymorphism)
        Animal[] animals = new Animal[4];
        
        // Initializing with different types of animals
        animals[0] = new Bird("Eagle", 5, "Golden Eagle", 200.5, true);
        animals[1] = new Mammal("Simba", 3, "Lion", "Golden", false);
        animals[2] = new Reptile("Cobra", 2, "King Cobra", true, "Diamond");
        animals[3] = new Bird("Penguin", 4, "Emperor Penguin", 90.0, false);
        
        // Demonstrating polymorphic behavior
        for (Animal animal : animals) {
            // These method calls will invoke the appropriate overridden methods
            animal.displayInfo();
            animal.makeSound();
            animal.move();
            System.out.println("------------------------");
        }
        
        // Demonstrating polymorphism through method parameter
        System.out.println("\nDemonstrating polymorphic method:");
        for (Animal animal : animals) {
            performAnimalActions(animal);
        }
    }
    
    // Method demonstrating polymorphism through parameter
    public static void performAnimalActions(Animal animal) {
        System.out.println("\nPerforming actions for " + animal.name + ":");
        animal.makeSound();
        animal.move();
    }
}