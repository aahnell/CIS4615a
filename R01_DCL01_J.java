/******************************************************************************
 * 
 * Ashley Ahnell
 * CIS4615 Fall 2024
 * Rule 01. Declarations and Initialization (DCL)
 * 
 ******************************************************************************/

 // Non-Compliant Code Example
 public class InitializationExample {

    // Vulnerable method that uses an uninitialized variable
    public static String getUserInput(String userInput) {
        String response;
        
        // The response variable is declared but not initialized before use
        if (userInput != null && !userInput.isEmpty()) {
            response = "Received input: " + userInput;
        }
        
        // If userInput is null or empty, response remains uninitialized
        return response; // Potentially returns a null reference
    }

    public static void main(String[] args) {
        // Example usage that demonstrates the vulnerability
        String result = getUserInput(""); // This will lead to an uninitialized variable
        System.out.println("Result: " + result); // May throw NullPointerException
    }
}
