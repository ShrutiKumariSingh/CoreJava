public class VehicleManagementSystem {
    public static void main(String[] args) {
        // Creating a LuxuryCar object to demonstrate the functionality
        LuxuryCar myLuxuryCar = new LuxuryCar("Tesla", "Model S", 2023, "Electric", "Autopilot");

        // Display the details of the LuxuryCar
        System.out.println("\nLuxury Car Details:");
        myLuxuryCar.displayDetails();
    }
}// Base class Vehicle
class Vehicle {
    String brand;
    String model;
    int year;

    // Constructor for Vehicle class
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        System.out.println("Vehicle Created: " + brand + " " + model + " (" + year + ")");
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

// Intermediate class Car (inherits from Vehicle)
class Car extends Vehicle {
    String fuelType;

    // Constructor for Car class, using constructor of Vehicle
    public Car(String brand, String model, int year, String fuelType) {
        super(brand, model, year);  // Calling the parent class constructor
        this.fuelType = fuelType;
        System.out.println("Car Created: " + fuelType + " fuel type");
    }

    // Method to display car details
    @Override
    public void displayDetails() {
        super.displayDetails();  // Calling the parent class method
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Derived class LuxuryCar (inherits from Car)
class LuxuryCar extends Car {
    String feature;

    // Constructor for LuxuryCar class, using constructor of Car
    public LuxuryCar(String brand, String model, int year, String fuelType, String feature) {
        super(brand, model, year, fuelType);  // Calling the parent class constructor
        this.feature = feature;
        System.out.println("Luxury Car Created: " + feature + " feature");
    }

    // Overriding method to display details of LuxuryCar
    @Override
    public void displayDetails() {
        super.displayDetails();  // Calling the parent class method
        System.out.println("Feature: " + feature);
    }
}

