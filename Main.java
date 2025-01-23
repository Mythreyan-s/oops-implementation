/*Create a simple Java program to demonstrate the concepts of inheritance, polymorphism, and encapsulation.
 The program should have a parent class called "Vehicle" and two child classes called "Car" and "Motorcycle". 
 Each vehicle should have attributes like color, max speed, and number of wheels. The program should also have 
 methods to display the vehicle's details and to calculate the vehicle's speed.

Answer
*/

// Parent class
class Vehicle {
    private String color;
    private int maxSpeed;
    private int numWheels;

    // Constructor
    public Vehicle(String color, int maxSpeed, int numWheels) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.numWheels = numWheels;
    }

    // Getter and setter methods
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Color: " + color);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Number of Wheels: " + numWheels);
    }

    // Method to calculate speed
    public void calculateSpeed(int time) {
        double speed = maxSpeed * time / 100;
        System.out.println("Speed: " + speed + " km/h");
    }
}

// Child class 1
class Car extends Vehicle {
    private int numDoors;

    // Constructor
    public Car(String color, int maxSpeed, int numWheels, int numDoors) {
        super(color, maxSpeed, numWheels);
        this.numDoors = numDoors;
    }

    // Getter and setter methods
    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    // Method to display car details
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Doors: " + numDoors);
    }
}

// Child class 2
class Motorcycle extends Vehicle {
    private int engineCapacity;

    // Constructor
    public Motorcycle(String color, int maxSpeed, int numWheels, int engineCapacity) {
        super(color, maxSpeed, numWheels);
        this.engineCapacity = engineCapacity;
    }

    // Getter and setter methods
    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    // Method to display motorcycle details
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Engine Capacity: " + engineCapacity + " cc");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create objects
        Car car = new Car("Red", 200, 4, 4);
        Motorcycle motorcycle = new Motorcycle("Blue", 250, 2, 600);

        // Display details
        System.out.println("Car Details:");
        car.displayDetails();
        car.calculateSpeed(50);

        System.out.println("\nMotorcycle Details:");
        motorcycle.displayDetails();
        motorcycle.calculateSpeed(50);
    }
}


/*This program demonstrates the concepts of inheritance (Car and Motorcycle classes inherit from Vehicle class)
, polymorphism (displayDetails() method is overridden in Car and Motorcycle classes), and encapsulation 
(attributes are private and accessed through getter and setter methods).*/