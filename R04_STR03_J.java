/******************************************************************************
 * 
 * Ashley Ahnell
 * CIS4615 Fall 2024
 * Rule 04. Characters and Strings (STR)
 * Status: Fixed
 ******************************************************************************/

 // Compliant Code Example
 import java.math.BigInteger;

public class CompliantExample {
    public static void main(String[] args) {
        // Create a valid BigInteger
        BigInteger x = new BigInteger("530500452766");

        // Convert BigInteger to String
        String s = x.toString();

        // Convert the String to a byte array
        byte[] byteArray = s.getBytes();

        // Create a new String from the byte array
        String ns = new String(byteArray);

        // Create a new BigInteger from the String
        x = new BigInteger(ns);

        // Print the final value of BigInteger
        System.out.println("Value of x: " + x);
    }
}
