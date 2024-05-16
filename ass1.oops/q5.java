
public class College {
    private String collegeName;
    private String collegeLoc;

    public College(String collegeName, String collegeLoc) {
        this.collegeName = collegeName;
        this.collegeLoc = collegeLoc;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public String getCollegeLoc() {
        return collegeLoc;
    }
}


public class Student {
    private int studentId;
    private String studentName;
    private College college;

    public Student(int studentId, String studentName, College college) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.college = college;
    }

    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("College Name: " + college.getCollegeName());
        System.out.println("College Location: " + college.getCollegeLoc());
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        College college1 = new College("ITER", "cHICAGO");
        Student student1 = new Student(1, "SHUBHAM", college1);

        student1.displayStudentInfo();
    }
}