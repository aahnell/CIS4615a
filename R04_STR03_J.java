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
        // Correct code example
        BigInteger x = new BigInteger("530500452766"); // Valid BigInteger

        // Convert BigInteger to String (valid character data)
        String s = x.toString();

        // Convert the String to byte array using default character encoding
        byte[] byteArray = s.getBytes();

        // Create a new String from the byte array (valid character data)
        String ns = new String(byteArray);

        // Create a new BigInteger from the String
        x = new BigInteger(ns); // This will produce the expected result

        // Output the final value of BigInteger
        System.out.println("Value of x: " + x);
    }
}
