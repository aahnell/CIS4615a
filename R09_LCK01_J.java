/******************************************************************************
 * 
 * Ashley Ahnell
 * CIS4615 Fall 2024
 * Rule 09. Locking (LCK)
 * 
 ******************************************************************************/

 // Non-Compliant Code Example
 public class LockingExample {
    private static int counter = 0;

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> incrementCounter());
        Thread thread2 = new Thread(() -> incrementCounter());

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Final counter value: " + counter);
    }

    private static void incrementCounter() {
        for (int i = 0; i < 1000; i++) {
            // No locking here, leading to potential race condition
            counter++;
        }
    }
}
