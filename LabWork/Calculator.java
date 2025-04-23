import java.util.Scanner;
public class Calculator
{
	public static void main(String[] args) 
	{
        	Scanner scanner = new Scanner(System.in);
		try 
		{
            		System.out.println("Enter the first number: ");
            		String num1Str = scanner.nextLine();
            		double num1 = Double.parseDouble(num1Str);  
            		System.out.println("Enter the second number: ");
            		String num2Str = scanner.nextLine();
            		double num2 = Double.parseDouble(num2Str);  
            		System.out.println("Choose the operation: ");
            		System.out.println("1. Addition (+)");
            		System.out.println("2. Subtraction (-)");
            		System.out.println("3. Multiplication (*)");
            		System.out.println("4. Division (/)");
            		String choiceStr = scanner.nextLine();
            		int choice = Integer.parseInt(choiceStr); 
            		double result = 0;
            		switch (choice) 
            		{
                		case 1: 
                    			result = num1 + num2;
                    			break;
                		case 2: 
                    			result = num1 - num2;
                    			break;
                		case 3: 
                    			result = num1 * num2;
                    			break;
                		case 4: 
                    			if (num2 == 0) 
                    			{
                        			throw new ArithmeticException("Cannot divide by zero!"); 
                    			}
                    			result = num1 / num2;
                    			break;
                		default:
                    			throw new IllegalArgumentException("Invalid choice! Please select a valid operation.");
            		}
             	System.out.println("The result is: " + result);
        } 
        catch (NumberFormatException e) 
        {
            	System.out.println("Error: Invalid input! Please enter valid numbers.");
        } 
        catch (ArithmeticException e) 
        {
        	System.out.println("Error: " + e.getMessage());
        } 
        catch (IllegalArgumentException e) 
        {
            	System.out.println("Error: " + e.getMessage());
        } 
        finally 
        {
            	System.out.println("Thank you");
            	scanner.close();  
        }
    }
}
