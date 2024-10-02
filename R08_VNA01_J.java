/******************************************************************************
 * 
 * Ashley Ahnell
 * CIS4615 Fall 2024
 * Rule 08. Visibility and Atomicity (VNA)
 * Status: Fixed
 ******************************************************************************/

 // Compliant Code Example
 public class VisibilityExample {
    private static volatile boolean flag = false; // Declare flag as volatile

    public static void main(String[] args) {
        Thread writerThread = new Thread(() -> {
            // Simulate some work
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            flag = true;  // Setting the flag to true
            System.out.println("Flag is set to true.");
        });

        Thread readerThread = new Thread(() -> {
            while (!flag) {
                // Busy-waiting until the flag is true
            }
            System.out.println("Reader thread detected flag change.");
        });

        writerThread.start();
        readerThread.start();
    }
}
