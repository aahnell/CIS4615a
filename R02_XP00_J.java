/******************************************************************************
 * 
 * Ashley Ahnell
 * CIS 4614 Fall 2024
 * Rule 02. Expressions (EXP)
 * 
 ******************************************************************************/

 // Non-Compliant Code Example
 import java.io.File;

 public class VulnerableFileDeletion {
     public void deleteFile() {
         File someFile = new File("someFileName.txt");
         // Attempt to delete the file but ignore the return value
         someFile.delete();
         // No error handling if the file deletion fails
     }
 
     public static void main(String[] args) {
         VulnerableFileDeletion fileDeletion = new VulnerableFileDeletion();
         fileDeletion.deleteFile();
         System.out.println("File deletion attempted.");
     }
 }
 


