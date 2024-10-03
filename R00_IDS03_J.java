/******************************************************************************
 * 
 * Ashley Ahnell
 * CIS4615 Fall 2024
 * Rule 00. Input Validation and Data Sanitization (IDS)
 * Status: Fixed
 ******************************************************************************/

 import java.util.logging.Logger;
import java.util.regex.Pattern;

public class VulnerableLogin {
    // Set up a logger to track login attempts
    private static final Logger logger = Logger.getLogger(VulnerableLogin.class.getName());

    public static void main(String[] args) {
        String username = "admin'; DROP TABLE users; --"; // Example of a malicious input
        boolean loginSuccessful = true; // Simulate a successful login

        // Log the result of the login with sanitized input
        if (loginSuccessful) {
            logger.severe("User login succeeded for: " + sanitizeUser(username));
        } else {
            logger.severe("User login failed for: " + sanitizeUser(username));
        }
    }

    public static String sanitizeUser(String username) {
        // Only allow letters and numbers in the username
        return Pattern.matches("[A-Za-z0-9]+", username) 
            ? username 
            : "unauthorized user";
    }
}
