/******************************************************************************
 * 
 * Ashley Ahnell
 * CIS 4614 Fall 2024
 * Rule 03. Numeric Types and Operations (NUM)
 * 
 ******************************************************************************/

 // Non-Compliant Code Example
 import java.io.DataInputStream;
 import java.io.IOException;
 
 public class Main {
     public static void main(String[] args) {
         // Simulated input stream, normally you would read from a real input stream
         DataInputStream dis = new DataInputStream(System.in);
         try {
             int value = getInteger(dis);
             System.out.println("Value read: " + value);
         } catch (IOException e) {
             e.printStackTrace();
         }
     }
 
     // Vulnerable method
     public static static int getInteger(DataInputStream is) throws IOException {
         return is.readInt(); // Vulnerability: reading an unsigned value as signed
     }
 }
 


