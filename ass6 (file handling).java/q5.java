import java.io.*;
import java.util.*;

public class q5 {
    public static void main(String[] args) {
        String mainDir = "G:/300324/csw2/Assignment_6/";
        File file = new File(mainDir);
        Stack<File> s = new Stack<>();
        s.push(file);
        System.out.println("Content of Directory " + mainDir + " is");
        while (!s.empty()) {
            File tmpF = s.pop();
            if (tmpF.isFile() && tmpF.getName().endsWith(".txt")) {
                System.out.println(tmpF.getName());
            } else if (tmpF.isDirectory()) {
                File[] f = tmpF.listFiles();
                for (File fpp : f) {
                    s.push(fpp);
                }
            }
        }
    }
}