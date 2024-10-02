/******************************************************************************
 * 
 * Ashley Ahnell
 * CIS 4614 Fall 2024
 * Rule 00. Input Validation and Data Sanitization (IDS)
 * 
 ******************************************************************************/

 // Non-compliant Code Exampleeeeeeeeeeeeeeeeeee
 import java.util.logging.Logger;

public class VulnerableLogin {
    // Logger instance
    private static final Logger logger = Logger.getLogger(VulnerableLogin.class.getName());

    public static void main(String[] args) {
        String username = "admin'; DROP TABLE users; --"; // Example of a malicious input
        boolean loginSuccessful = true; // Simulating a successful login for demonstration

        // Vulnerable logging without input sanitization
        if (loginSuccessful) {
            logger.severe("User login succeeded for: " + username);
        } else {
            logger.severe("User login failed for: " + username);
        }
    }
}
