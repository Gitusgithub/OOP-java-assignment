//Code from netbeans

// Interface defining basic animal behaviors
interface Animal {
    void makeSound(); // Every animal makes a sound
    void eat(); // Every animal eats
}

// Abstract class providing common functionality for mammals
abstract class Mammal implements Animal {
    protected String name;

    public Mammal(String name) {
        this.name = name;
    }
    
    // Common method for all mammals
    public void eat() {
        System.out.println(name + " is eating.");
    }
    
    // Abstract method that must be implemented by subclasses
    public abstract void move();
}

// Concrete class representing a Dog
class Dog extends Mammal {
    public Dog(String name) {
        super(name);
    }

    // Implementation of sound behavior
    public void makeSound() {
        System.out.println(name + " barks.");
    }
    
    // Implementation of movement behavior
    public void move() {
        System.out.println(name + " runs on four legs.");
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        // Creating a Dog object and testing its behaviors
        Dog myDog = new Dog("Buddy");
        
        myDog.makeSound(); // Buddy barks.
        myDog.eat();       // Buddy is eating.
        myDog.move();      // Buddy runs on four legs.
    }
}