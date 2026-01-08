import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileReader {

    public static void ReadFile(String FilePath) {      //file path parameter
        File inFile = new File(FilePath);               // new File class
        try (Scanner scan = new Scanner(inFile)) {      // new Scanner class
            while (scan.hasNext()) {                    // while scan.hasnext() reads all lines
                System.out.print("Line Read");
                scan.next();                            // integrates to next line
            }
            scan.close();                               // closes the scanner
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found: " + inFile.getPath());
        }
    }

    public static void WriteFile(String FilePath){
        try(PrintWriter outFile = new PrintWriter(FilePath)) {  // new PrintWriter
            outFile.println("printing into outFile");           // printing into outFile
            outFile.close();                                    // closes outFile
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found: " + FilePath);
        }
    }

    public static void main(String[] args){
        // need File, Scanner, and PrintWriter
        // File and Scanner read in files
        // Scanner goes in the try block
        // PrintWriter prints into files
        // PrintWrtier goes into the try block
    }
}
