// Class to handle the password validation logic
class PasswordValidator
  {

    // Method to check if the password is valid
    public static int checkPassword(String str) {
        // Condition 1: At least 4 characters
        if (str.length() < 4) {
            return 0;
        }

        // Flags for conditions
        boolean hasDigit = false, hasUpper = false;

        // Condition 5: Starting character must not be a number
        if (Character.isDigit(str.charAt(0))) {
            return 0;
        }

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Condition 4: Must not have space or slash
            if (ch == ' ' || ch == '/') {
                return 0;
            }

            // Condition 2: Check if there is at least one digit
            if (Character.isDigit(ch)) {
                hasDigit = true;
            }

            // Condition 3: Check if there is at least one capital letter
            if (Character.isUpperCase(ch)) {
                hasUpper = true;
            }
        }

        // Return 1 if all conditions are satisfied
        return (hasDigit && hasUpper) ? 1 : 0;
    }
}

// Main class to test the PasswordValidator
public class Main 
{

    public static void main(String[] args) {
        // Test cases
        String password1 = "Pass123";
        String password2 = "1234";
        String password3 = "Pass 123";
        String password4 = "pass/123";
        String password5 = "pass";

        System.out.println("Password 1: " + PasswordValidator.checkPassword(password1));  // Expected output: 1
        System.out.println("Password 2: " + PasswordValidator.checkPassword(password2));  // Expected output: 0
        System.out.println("Password 3: " + PasswordValidator.checkPassword(password3));  // Expected output: 0
        System.out.println("Password 4: " + PasswordValidator.checkPassword(password4));  // Expected output: 0
        System.out.println("Password 5: " + PasswordValidator.checkPassword(password5));  // Expected output: 0
    }
}
