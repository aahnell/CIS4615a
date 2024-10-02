/******************************************************************************
 * 
 * Ashley Ahnell
 * CIS 4614 Fall 2024
 * Rule 00. Input Validation and Data Sanitization (IDS)
 * Status: Fixed
 ******************************************************************************/

 // Compliant Code Example
 import java.util.logging.Logger;
import java.util.regex.Pattern;

public class VulnerableLogin {
    // Logger instance
    private static final Logger logger = Logger.getLogger(VulnerableLogin.class.getName());

    public static void main(String[] args) {
        String username = "admin'; DROP TABLE users; --"; // Example of a malicious input
        boolean loginSuccessful = true; // Simulating a successful login for demonstration

        // Logging with input sanitization
        if (loginSuccessful) {
            logger.severe("User login succeeded for: " + sanitizeUser(username));
        } else {
            logger.severe("User login failed for: " + sanitizeUser(username));
        }
    }

    public static String sanitizeUser(String username) {
        // Check if the username contains only alphanumeric characters
        return Pattern.matches("[A-Za-z0-9]+", username) 
            ? username 
            : "unauthorized user";
    }
}
