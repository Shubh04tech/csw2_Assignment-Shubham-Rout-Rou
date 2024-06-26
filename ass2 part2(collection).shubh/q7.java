import java.util.*;
class Address {
    int plot_no;
    String at, post;

    public Address(int plot_no, String at, String post) {
        this.plot_no = plot_no;
        this.at = at;
        this.post = post;
    }

    public String toString() {
        return "\tPlot No : " + plot_no + " Area Type : " + at + " Post Office : " + post;
    }
}
public class q7 {
    public static void main(String[] args) {
        TreeMap<String, Address> ob = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 person name and address");
        for (int i = 0; i < 2; i++) {
            String nm = sc.nextLine();
            int plot_no = sc.nextInt();
            sc.nextLine();
            Address adr = new Address(plot_no, sc.nextLine(), sc.nextLine());
            ob.put(nm, adr);
        }
        System.out.println("\nPerson Name \tAddress");
        Set s = ob.entrySet();
        Iterator itr = s.iterator();
        while (itr.hasNext()) {
            Map.Entry<String, Address> a = (Map.Entry) itr.next();
            System.out.println(a.getKey() + "\t" + a.getValue());
            System.out.println();
        }
    }
}
