/******************************************************************************
 * 
 * Ashley Ahnell
 * CIS4615 Fall 2024
 * Rule 06. Methods (MET)
 * Status: Fixed
 ******************************************************************************/

 // Compliant Code Example
 public class VulnerableExample {

    // Method that has been corrected to handle potential vulnerabilities
    public static int getAbsAdd(int x, int y) {
        // Validate input to prevent illegal arguments
        if (x == Integer.MIN_VALUE || y == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("x and y cannot be Integer.MIN_VALUE");
        }

        int absX = Math.abs(x);
        int absY = Math.abs(y);

        // Validate to prevent overflow
        if (absX > Integer.MAX_VALUE - absY) {
            throw new IllegalArgumentException("Sum would overflow");
        }

        return absX + absY; // Safely return the sum
    }

    public static void main(String[] args) {
        try {
            // Example usage that demonstrates safe behavior
            int result = getAbsAdd(Integer.MIN_VALUE, 1); // This will throw an exception
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}




