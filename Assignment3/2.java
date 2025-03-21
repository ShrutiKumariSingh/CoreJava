// Main class to demonstrate the Online Shopping System
public class OnlineShoppingSystem {
    public static void main(String[] args) {
        // Create a Smartphone object and display its details
        Smartphone mySmartphone = new Smartphone("Samsung Galaxy S21", 799.99, 2, 24);

        // Display the details of the Smartphone
        System.out.println("Smartphone Details:");
        mySmartphone.displayProductDetails();
    }
}// Base class Product
class Product {
    String productName;
    double price;

    // Constructor for Product class
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    // Method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }
}

// Intermediate class Electronics (inherits from Product)
class Electronics extends Product {
    int warrantyPeriod;

    // Constructor for Electronics class, using constructor of Product
    public Electronics(String productName, double price, int warrantyPeriod) {
        super(productName, price);  // Calling the parent class constructor
        this.warrantyPeriod = warrantyPeriod;
    }

    // Overriding method to display product details including warranty period
    @Override
    public void displayProductDetails() {
        super.displayProductDetails();  // Calling the parent class method
        System.out.println("Warranty Period: " + warrantyPeriod + " years");
    }
}

// Derived class Smartphone (inherits from Electronics)
class Smartphone extends Electronics {
    int batteryLife; // in hours

    // Constructor for Smartphone class, using constructor of Electronics
    public Smartphone(String productName, double price, int warrantyPeriod, int batteryLife) {
        super(productName, price, warrantyPeriod);  // Calling the parent class constructor
        this.batteryLife = batteryLife;
    }

    // Overriding method to display details of the Smartphone
    @Override
    public void displayProductDetails() {
        super.displayProductDetails();  // Calling the parent class method
        System.out.println("Battery Life: " + batteryLife + " hours");
    }
}


