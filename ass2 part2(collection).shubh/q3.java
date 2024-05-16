import java.util.*;

class Car implements Comparable<Car> {
    private int ModalNo;
    private String name;
    private int stock;

    Car(int modalno, String nm, int stk) {
        this.ModalNo = modalno;
        this.name = nm;
        this.stock = stk;
    }

    public int compareTo(Car c) {
        return this.stock - c.stock;
    }

    public String toString() {
        return "ModalNo:" + this.ModalNo + "\tName:" + this.name + "\tStock:" + this.stock + "\n";
    }
}
public class q3 {
    public static void main(String[] args) {
        ArrayList<Car> ob = new ArrayList<>();
        ob.add(new Car(2013, "innova", 10));
        ob.add(new Car(2017, "crysta", 45));
        ob.add(new Car(2018, "mazda", 20));
        ob.add(new Car(2015, "audi", 55));
        ob.add(new Car(2020, "unicorn", 13));
        Collections.sort(ob);
        System.out.println("Sorted List:\n" + ob);

    }
}


