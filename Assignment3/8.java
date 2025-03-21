// Custom Exception for OutOfStock scenario
public class OutOfStockException extends Exception {
    
    // Constructor to pass custom message
    public OutOfStockException(String message) {
        super(message);
    }
}
// Class to represent a product in the system
public class Product {
    private String name;  // Product name
    private int stock;    // Available stock
    
    // Constructor to initialize product name and stock
    public Product(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }

    // Method to purchase a product with a specified quantity
    public void purchase(int quantity) throws OutOfStockException {
        // Check if stock is sufficient
        if (quantity > stock) {
            // Throw exception if quantity exceeds available stock
            throw new OutOfStockException("Insufficient stock for product: " + name + ". Available stock: " + stock);
        } else {
            // Deduct stock if purchase is successful
            stock -= quantity;
            System.out.println("Successfully purchased " + quantity + " of " + name + ".");
            System.out.println("Remaining stock: " + stock);
        }
    }
}
// Main class to simulate the order placement
public class ECommerceSystem {
    public static void main(String[] args) {
        // Create a product with name "Laptop" and stock 5
        Product laptop = new Product("Laptop", 5);
        
        try {
            // Try to purchase 7 laptops (which exceeds the available stock)
            laptop.purchase(7);  // This will throw OutOfStockException
        } catch (OutOfStockException e) {
            // Handle the exception and display the error message
            System.out.println("Error: " + e.getMessage());
        }

        try {
            // Try to purchase 3 laptops (which is within the available stock)
            laptop.purchase(3);  // This will succeed
        } catch (OutOfStockException e) {
            // Handle the exception if thrown
            System.out.println("Error: " + e.getMessage());
        }
    }
}
