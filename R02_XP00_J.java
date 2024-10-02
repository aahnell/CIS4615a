/******************************************************************************
 * 
 * Ashley Ahnell
 * CIS 4614 Fall 2024
 * Rule 02. Expressions (EXP)
 * Status: Fixed
 ******************************************************************************/

 // Compliant Code Example
import java.io.File;

public class VulnerableFileDeletion {
    public void deleteFile() {
        File someFile = new File("someFileName.txt");
        // Attempt to delete the file and handle the return value
        if (!someFile.delete()) {
            // Handle failure to delete the file
            System.err.println("Failed to delete the file: " + someFile.getName());
        } else {
            System.out.println("File deleted successfully: " + someFile.getName());
        }
    }

    public static void main(String[] args) {
        VulnerableFileDeletion fileDeletion = new VulnerableFileDeletion();
        fileDeletion.deleteFile();
        System.out.println("File deletion attempted.");
    }
}

