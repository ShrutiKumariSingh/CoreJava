import java.util.Scanner;
public class OnlinePayment 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Payment paymentMethod = null;
        System.out.println("Choose payment method:");
        System.out.println("1. Credit Card");
        System.out.println("2. PayPal");
        System.out.println("3. UPI");

        int ch = sc.nextInt();
        sc.nextLine();
        switch (ch) 
        {
            case 1:
                paymentMethod = new CreditCard();
                System.out.println("Enter your 16-digit Credit Card number:");
                String cardNumber = sc.nextLine();
                paymentMethod.validatePaymentDetails(cardNumber);
                break;
            case 2:
                paymentMethod = new PayPal();
                System.out.println("Enter your PayPal email:");
                String email = sc.nextLine();
                paymentMethod.validatePaymentDetails(email);
                break;
            case 3:
                paymentMethod = new UPI();
                System.out.println("Enter your UPI ID:");
                String upiId = sc.nextLine();
                paymentMethod.validatePaymentDetails(upiId);
                break;
            default:
                System.out.println("Invalid choice. Exiting.");
                return;
        }
        if(paymentMethod.validatePaymentDetails(cardNumber)==1 || paymentMethod.validatePaymentDetails(email)==1 ||paymentMethod.validatePaymentDetails(upiId)==1)
        {
        	System.out.println("Enter the amount to process:");
        	double amount = sc.nextDouble();
       		paymentMethod.processPayment(amount);
        	paymentMethod.generateReceipt();
        }
    }
}
abstract class Payment 
{
    public abstract void validatePaymentDetails(String details);
    public abstract void processPayment(double amount);
    public void generateReceipt() 
    {
    	System.out.println("Receipt generated for the payment.");
    }
}
class CreditCard extends Payment 
{
    public void validatePaymentDetails(String cardNumber) 
    {
    	int x;
        if (cardNumber.length() == 16 && cardNumber.matches("[0-9]+")) 
        {
        	System.out.println("Credit card validation successful.");
        	x=1;
        } 
        else 
        {
        	System.out.println("Invalid credit card number.");
        	x=0;
        }
        return x;
    }
    public void processPayment(double amount) 
    {
    	System.out.println("Processing card payment of Rs." + amount);
    }
}
class PayPal extends Payment 
{
   public void validatePaymentDetails(String email) 
   {
   	int y;
        if (!email.isEmpty() && email.contains("@")) 
        {
        	System.out.println("PayPal validation successful.");
        	y=1;
        } 
        else 
        {
        	System.out.println("Invalid email. It should not be empty and must contain '@'.");
        	y=0;
        }
        return y;
    }
    public void processPayment(double amount) 
    {
    	System.out.println("Processing PayPal payment of Rs." + amount);
    }
}
class UPI extends Payment 
{
    public void validatePaymentDetails(String upiId) 
    {
    	int z;
        if (upiId.contains("@")) 
        {
        	System.out.println("UPI validation successful.");
        	z=1;
        } 
        else 
        {
        	System.out.println("Invalid UPI ID. It must contain '@'.");
        	z=0;
        }
        return z;
    }
    public void processPayment(double amount) 
    {
        System.out.println("Processing UPI payment of Rs." + amount);
    }
}
