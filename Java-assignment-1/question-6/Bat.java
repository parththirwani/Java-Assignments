public class Bat implements Animal, Bird {
    @Override
    public void makeSound() {
        System.out.println("Bat makes a screeching sound.");
    }

    @Override
    public void fly() {
        System.out.println("Bat is flying.");
    }
}