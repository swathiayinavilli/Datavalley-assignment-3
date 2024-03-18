Abstraction in Java is a concept that allows you to hide the complex implementation details and show only the necessary features of an object. It enables you to focus on what an object does rather than how it achieves its functionality. In Java, abstraction is achieved using abstract classes and interfaces.

// Abstract class representing a Vehicle
abstract class Vehicle {
    // Abstract method to start the vehicle
    public abstract void start();

    // Abstract method to stop the vehicle
    public abstract void stop();

    // Concrete method to display information about the vehicle
    public void displayInfo() {
        System.out.println("Vehicle information:");
    }
}

// Concrete class representing a Car
class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
}

// Interface representing a Musical Instrument
interface MusicalInstrument {
    void playSound();
}

// Concrete class representing a Guitar
class Guitar implements MusicalInstrument {
    @Override
    public void playSound() {
        System.out.println("Guitar playing...");
    }
}

// Concrete class representing a Piano
class Piano implements MusicalInstrument {
    @Override
    public void playSound() {
        System.out.println("Piano playing...");
    }
}

public class Main {
    public static void main(String[] args) {
        // Abstraction using abstract classes
        Vehicle car = new Car();
        car.displayInfo();
        car.start();
        car.stop();

        // Abstraction using interfaces
        MusicalInstrument guitar = new Guitar();
        guitar.playSound();

        MusicalInstrument piano = new Piano();
        piano.playSound();
    }
}
