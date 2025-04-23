import java.util.Scanner;
public class CustomExceptionExample 
{
    public static void checkStringLength(String input) throws StringLengthException 
    {
        if (input.length() > 10) 
        {
            throw new StringLengthException("StringIndexOutOfBoundsException: String length exceeds 10 characters");
        }
        System.out.println("Valid string: " + input);
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string (max 10 characters): ");
        String userInput = scanner.nextLine();
        try 
        {
            checkStringLength(userInput); 
        } 
        catch (StringLengthException e) 
        {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}
class StringLengthException extends ArrayIndexOutOfBoundsException {
    public StringLengthException(String message) 
    {
        super(message); 
    }
}
