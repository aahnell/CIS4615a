/******************************************************************************
 * 
 * Ashley Ahnell
 * CIS4615 Fall 2024
 * Rule 01. Declarations and Initialization (DCL)
 * Status: Fixed
 ******************************************************************************/

 // Compliant Code Example
 public class InitializationExample {

    // Method that makes sure the response is always set
    public static String getUserInput(String userInput) {
        String response = "No input received."; // Set a default response
        
        // Check if userInput is valid
        if (userInput != null && !userInput.isEmpty()) {
            response = "Received input: " + userInput; // Change response if valid input is given
        }

        return response; // Always returns an initialized response
    }

    public static void main(String[] args) {
        // Example showing how the method works
        String result = getUserInput(""); // This avoids any uninitialized variable issues
        System.out.println("Result: " + result); // Safely prints the response
    }
}
