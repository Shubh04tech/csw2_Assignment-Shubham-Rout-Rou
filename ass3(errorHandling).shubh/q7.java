import java.util.*;

public class q7 {
    public static void main(String[] args) {
        boolean b = false;
        Scanner sc = new Scanner(System.in);
        while (!b) {
            try {
                String s = sc.next();
                int n = Integer.parseInt(s);
                b = true;
            } catch (NumberFormatException e) {
                System.out.println(e);
            }
        }
        System.out.println("End of Program");
    }
}