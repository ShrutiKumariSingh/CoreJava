// Main class to test the payment system
public class PaymentSystem {
    public static void main(String[] args) {
        // Create a CreditCardPayment object and process the payment
        Payment creditCardPayment = new CreditCardPayment("CC12345", 500.00);
        creditCardPayment.processPayment();

        System.out.println();  // Add space between the outputs

        // Create a PayPalPayment object and process the payment
        Payment paypalPayment = new PayPalPayment("PP67890", 300.00);
        paypalPayment.processPayment();
    }
}
// Abstract class Payment
abstract class Payment {
    String transactionId;
    double amount;

    // Constructor to initialize the transaction ID and amount
    public Payment(String transactionId, double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }

    // Abstract method to process the payment
    public abstract void processPayment();
}

// Subclass CreditCardPayment (inherits from Payment)
class CreditCardPayment extends Payment {

    // Constructor for CreditCardPayment class
    public CreditCardPayment(String transactionId, double amount) {
        super(transactionId, amount); // Calling the parent class constructor
    }

    // Overriding the processPayment method for CreditCardPayment
    @Override
    public void processPayment() {
        double transactionFee = 0.02 * amount;  // 2% transaction fee for Credit Card
        double totalAmount = amount + transactionFee;
        System.out.println("Processing Credit Card Payment...");
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Amount: $" + amount);
        System.out.println("Transaction Fee (2%): $" + transactionFee);
        System.out.println("Total Amount to be Charged: $" + totalAmount);
    }
}

// Subclass PayPalPayment (inherits from Payment)
class PayPalPayment extends Payment {

    // Constructor for PayPalPayment class
    public PayPalPayment(String transactionId, double amount) {
        super(transactionId, amount); // Calling the parent class constructor
    }

    // Overriding the processPayment method for PayPalPayment
    @Override
    public void processPayment() {
        double transactionFee = 0.03 * amount;  // 3% transaction fee for PayPal
        double totalAmount = amount + transactionFee;
        System.out.println("Processing PayPal Payment...");
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Amount: $" + amount);
        System.out.println("Transaction Fee (3%): $" + transactionFee);
        System.out.println("Total Amount to be Charged: $" + totalAmount);
    }
}

