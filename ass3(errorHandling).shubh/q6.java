
public class q6 {
    public static void main(String[] args) {
        try {
            int n = Integer.parseInt(null);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
        System.out.println("End");
    }

}