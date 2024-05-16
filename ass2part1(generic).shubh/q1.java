class Student_1<T> {
    String name;
    T roll;
    int age;

    Student_1(String name, T roll, int age) {
        this.name = name;
        this.roll = roll;
        this.age = age;
    }

    public String toString() {
        return "Name: " + this.name + "\t Roll No.: " + this.roll + "\t Age:" + this.age;
    }
}
public class Q1 {
    public static void main(String[] args) {
        Student_1<Integer> a = new Student_1<>("shubham", 1, 24);
        Student_1<String> b = new Student_1<>("rout", "2", 35);
        System.out.println(a + "\n" + b);
    }
}