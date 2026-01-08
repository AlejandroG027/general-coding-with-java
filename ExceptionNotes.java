import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionNotes {
    // 2 types
    // 1. Checked: problem to be handled during compiling phase
    // 2. Unchecked: problem handled during runtime

    // To handle these exceptions on our own, we can use try and catch blocks

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input: ");
        String fname = scanner.next();
        File inFile = new File(fname);
        try{
            Scanner outFile = new Scanner(inFile);
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
            System.out.println("Wrong Bro");
            e.printStackTrace();
        } finally {
            System.out.print("Done");
        }
    }
}
