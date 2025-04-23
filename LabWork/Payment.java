import java.util.Scanner;

abstract class Payment {
    public abstract void validatePaymentDetails(String details);
    public abstract void processPayment(Double amount);

    public void generateReceipt() {
        System.out.println("Receipt generated");
    }
}

class CreditCard extends Payment {
    public void validatePaymentDetails(String cardNumber) {
        if (cardNumber.length() == 16 && cardNumber.matches("[0-9]+")) {
            System.out.println("Credit card validation successful.");
        } else {
            System.out.println("Invalid credit card number. It must be 16 digits.");
        }
    }

    @Override
    public void processPayment(Double amount) {
        System.out.println("Processing card payment of Rs." + amount);
    }
}

class PayPal extends Payment {
    
    public void validatePaymentDetails(String email) {
        if (!email.isEmpty() && email.contains("@")) {
            System.out.println("PayPal validation successful.");
        } else {
            System.out.println("Invalid email. It should not be empty and must contain '@'.");
        }
    }

    @Override
    public void processPayment(Double amount) {
        System.out.println("Processing PayPal payment of Rs." + amount);
    }
}

class UPI extends Payment {
   
    public void validatePaymentDetails(String upiId) {
        if (upiId.contains("@")) {
            System.out.println("UPI validation successful.");
        } else {
            System.out.println("Invalid UPI ID. It must contain '@'.");
        }
    }

    @Override
    public void processPayment(Double amount) {
        System.out.println("Processing UPI payment of Rs." + amount);
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Payment paymentMethod = null;

        System.out.println("Choose payment method:");
        System.out.println("1. Credit Card");
        System.out.println("2. PayPal");
        System.out.println("3. UPI");

        int choice = scanner.nextInt();
        scanner.nextLine();  
        switch (choice) {
            case 1:
                paymentMethod = new CreditCard();
                System.out.println("Enter your 16-digit Credit Card number:");
                String cardNumber = scanner.nextLine();
                paymentMethod.validatePaymentDetails(cardNumber);
                break;
            case 2:
                paymentMethod = new PayPal();
                System.out.println("Enter your PayPal email:");
                String email = scanner.nextLine();
                paymentMethod.validatePaymentDetails(email);
                break;
            case 3:
                paymentMethod = new UPI();
                System.out.println("Enter your UPI ID:");
                String upiId = scanner.nextLine();
                paymentMethod.validatePaymentDetails(upiId);
                break;
            default:
                System.out.println("Invalid choice. Exiting.");
                return;
        }

        System.out.println("Enter the amount to process:");
        double amount = scanner.nextDouble();
        paymentMethod.processPayment(amount);

        paymentMethod.generateReceipt();
    }
}
