/******************************************************************************
 * 
 * Ashley Ahnell
 * CIS4615 Fall 2024
 * Rule 08. Visibility and Atomicity (VNA)
 * Status: Fixed
 ******************************************************************************/

 // Compliant Code Example
public class VisibilityExample {
    private static volatile boolean flag = false; // Make flag volatile

    public static void main(String[] args) {
        Thread writerThread = new Thread(() -> {
            // Simulate work
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            flag = true;  // Set flag to true
            System.out.println("Flag is set to true.");
        });

        Thread readerThread = new Thread(() -> {
            while (!flag) {
                // Wait until the flag is true
            }
            System.out.println("Reader thread detected flag change.");
        });

        writerThread.start();
        readerThread.start();
    }
}
