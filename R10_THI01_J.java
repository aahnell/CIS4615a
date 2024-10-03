/******************************************************************************
 * 
 * Ashley Ahnell
 * CIS4615 Fall 2024
 * Rule 10. Thread APIs (THI)
 * Status: Fixed
 ******************************************************************************/

 // Compliant Code Example
 public class ThreadApiExample {
    public static void main(String[] args) {
        // Create tasks using the Runnable interface
        Runnable task1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Thread 1: " + i);
                }
            }
        };

        Runnable task2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Thread 2: " + i);
                }
            }
        };

        // Create threads with the Runnable tasks
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        // Start the threads
        thread1.start();
        thread2.start();
        
        // Wait for the threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore interrupted status
        }
    }
}
