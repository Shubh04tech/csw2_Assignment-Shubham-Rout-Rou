
public class Laptop {
    private String model;
    private double price;

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop{" + "model='" + model + '\'' +", price=" + price +'}';
    }
}


public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.setModel("hp xperia");
        laptop.setPrice(4300.0);

        System.out.println(laptop.toString());
    }
}