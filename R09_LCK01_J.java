/******************************************************************************
 * 
 * Ashley Ahnell
 * CIS4615 Fall 2024
 * Rule 09. Locking (LCK)
 * Status: Fixed
 ******************************************************************************/

 // Compliant Code Example
public class LockingExampleFixed {
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

    // Synchronized method to make sure increments are thread-safe
    private synchronized static void incrementCounter() {
        for (int i = 0; i < 1000; i++) {
            counter++;
        }
    }
}
