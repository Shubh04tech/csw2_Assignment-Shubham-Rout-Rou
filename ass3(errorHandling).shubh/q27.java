public class q27 {
    public static void main(String[] args) {
        try {
            Object obj = 5;
            System.out.println((String) obj);
        } catch (ClassCastException e) {
            System.out.println(e);
        }
        System.out.println("End of program");
    }
}