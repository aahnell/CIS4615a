/******************************************************************************
 * 
 * Ashley Ahnell
 * CIS 4614 Fall 2024
 * Rule 07. Exceptional Behavior (ERR)
 * Status: Fixed
 ******************************************************************************/

 // Compliant Code Example
public class ExceptionExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Properly check the length before accessing the array
        for (int i = 0; i < numbers.length; i++) { // Change <= to <
            System.out.println(numbers[i]);
        }

        System.out.println("Program continues...");
    }
}

