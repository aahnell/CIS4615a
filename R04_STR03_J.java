/******************************************************************************
 * 
 * Ashley Ahnell
 * CIS 4614 Fall 2024
 * Rule 04. Characters and Strings (STR)
 * 
 ******************************************************************************/

 // Non-Compliant Code Example
 import java.math.BigInteger;

 public class VulnerableExample {
     public static void main(String[] args) {
         // Non-compliant code example
         BigInteger x = new BigInteger("530500452766"); // Valid BigInteger
 
         // Convert BigInteger to byte array
         byte[] byteArray = x.toByteArray();
 
         // Incorrectly create a String from the byte array (not character data)
         String s = new String(byteArray);
 
         // Convert back from the String to byte array (this can lead to issues)
         byteArray = s.getBytes();
 
         // Create a new BigInteger from the byte array
         x = new BigInteger(byteArray); // This may produce unexpected results
 
         // Output the final value of BigInteger
         System.out.println("Value of x: " + x);
     }
 }
 


