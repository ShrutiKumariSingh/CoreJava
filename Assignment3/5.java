// Interface for UPI Payment
interface UPIPayment {
    void payViaUPI(String upiId, double amount);
}

// Interface for Card Payment
interface CardPayment {
    void payViaCard(String cardNumber, String cardHolder, double amount);
}

// Class that implements both interfaces to handle UPI and Card payments
class OnlinePayment implements UPIPayment, CardPayment {

    // Implementing the method for UPI payment
    @Override
    public void payViaUPI(String upiId, double amount) {
        System.out.println("Processing UPI Payment...");
        System.out.println("UPI ID: " + upiId);
        System.out.println("Amount: ₹" + amount);
        System.out.println("Payment Successful via UPI!");
    }

    // Implementing the method for Card payment
    @Override
    public void payViaCard(String cardNumber, String cardHolder, double amount) {
        System.out.println("Processing Card Payment...");
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Card Holder: " + cardHolder);
        System.out.println("Amount: ₹" + amount);
        System.out.println("Payment Successful via Card!");
    }
}

// Main class to simulate payment processing
public class PaymentSystem {
    public static void main(String[] args) {
        // Create an instance of OnlinePayment to process both UPI and Card payments
        OnlinePayment onlinePayment = new OnlinePayment();

        // Process UPI payment
        System.out.println("UPI Payment Processing:");
        onlinePayment.payViaUPI("john.doe@upi", 1500.50);
        System.out.println();

        // Process Card payment
        System.out.println("Card Payment Processing:");
        onlinePayment.payViaCard("1234-5678-9876-5432", "John Doe", 2500.75);
    }
}
