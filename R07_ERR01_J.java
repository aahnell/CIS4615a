/******************************************************************************
 * 
 * Ashley Ahnell
 * CIS 4614 Fall 2024
 * Rule 07. Exceptional Behavior (ERR)
 * 
 ******************************************************************************/

 // Non-Compliant Code Example
 public class ExceptionExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        try {
            // Improper use of exception for control flow
            for (int i = 0; i <= numbers.length; i++) {
                System.out.println(numbers[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an exception! Used for control flow.");
        }
        
        System.out.println("Program continues...");
    }
}
