/******************************************************************************
 * 
 * Ashley Ahnell
 * CIS4615 Fall 2024
 * Rule 02. Expressions (EXP)
 * Status: Fixed
 ******************************************************************************/

 // Compliant Code Example
import java.io.File;

public class VulnerableFileDeletion {
    public void deleteFile() {
        File someFile = new File("someFileName.txt");
        // Try to delete the file and check if it worked
        if (!someFile.delete()) {
            // If it didn't work, print an error message
            System.err.println("Failed to delete the file: " + someFile.getName());
        } else {
            // If it worked, print a success message
            System.out.println("File deleted successfully: " + someFile.getName());
        }
    }

    public static void main(String[] args) {
        VulnerableFileDeletion fileDeletion = new VulnerableFileDeletion();
        fileDeletion.deleteFile();
        System.out.println("File deletion attempted.");
    }
}


