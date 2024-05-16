import java.util.*;
import java.io.*;

public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the file: ");
        String fileName = sc.nextLine();
        File file = new File(fileName);
        if (file.exists()) {
            System.out.println("File Size: " + file.length() + " bytes");
            System.out.println("Last Modified: " + new Date(file.lastModified()));
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());

        } else {
            System.out.println("File does not exist.");
        }
    }
}
