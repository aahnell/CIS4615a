/******************************************************************************
 * 
 * Ashley Ahnell
 * CIS 4614 Fall 2024
 * Rule 06. Methods (MET)
 * 
 ******************************************************************************/

 // Non-Compliant Code Example
 public class VulnerableExample {
    
    // Method that has potential vulnerabilities
    public static int getAbsAdd(int x, int y) {
        // Vulnerable assertions that do not properly handle invalid inputs
        assert x != Integer.MIN_VALUE : "x cannot be Integer.MIN_VALUE";
        assert y != Integer.MIN_VALUE : "y cannot be Integer.MIN_VALUE";
        
        int absX = Math.abs(x);
        int absY = Math.abs(y);
        
        // Assertion that could lead to overflow
        assert (absX <= Integer.MAX_VALUE - absY) : "Sum would overflow";
        
        return absX + absY; // Potential overflow when x and y are large
    }

    public static void main(String[] args) {
        // Example usage that demonstrates the vulnerability
        int result = getAbsAdd(Integer.MIN_VALUE, 1); // This will cause an assertion failure
        System.out.println("Result: " + result);
    }
}



