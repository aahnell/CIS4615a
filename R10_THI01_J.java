/******************************************************************************
 * 
 * Ashley Ahnell
 * CIS4615 Fall 2024
 * Rule 10. Thread APIs (THI)
 * 
 ******************************************************************************/

 // Non-Compliant Code Example
 public class ThreadApiExample {
    public static void main(String[] args) {
        // Creating threads using the Thread class directly
        Thread thread1 = new Thread() {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Thread 1: " + i);
                }
            }
        };

        Thread thread2 = new Thread() {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Thread 2: " + i);
                }
            }
        };

        thread1.start();
        thread2.start();
    }
}
