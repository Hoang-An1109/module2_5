package static_method;

import java.*;

public class Student {
    private int rollno;
    private String name;
    private static String college="BBDIT";

    public Student() {
    }

    public Student(int r, String n) {
        rollno = r;
        name = n;
    }

    //    static_method.Student(int r, String n) {
//        rollno = r;
//        name = n;
//    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getCollege() {
        return college;
    }

    public static void setCollege(String college) {
        Student.college = college;
    }

    //static method to change the value of static variable
    static void change() {
        college = "CODEGYM";
    }

    @Override
    public String toString() {
        return
                "rollno=" + rollno +
                ", name='" + name ;
    }

    //method to display values
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }


    public static void main(String[] args) {
        Student student1= new Student();
        student1.setName("huy");
        Student.setCollege("CodeGym");
        Student student2=new Student(11,"an");
        System.out.println(student2);
    }

}
