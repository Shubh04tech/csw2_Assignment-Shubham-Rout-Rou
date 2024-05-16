import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
public class q2 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("Data/diary.txt");
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
            fr.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}