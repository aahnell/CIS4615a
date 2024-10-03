/******************************************************************************
 * 
 * Ashley Ahnell
 * CIS4615 Fall 2024
 * Rule 07. Exceptional Behavior (ERR)
 * Status: Fixed
 ******************************************************************************/

 // Compliant Code Example
public class ExceptionExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Check length before accessing the array
        for (int i = 0; i < numbers.length; i++) { // Use < instead of <=
            System.out.println(numbers[i]);
        }

        System.out.println("Program continues...");
    }
}


