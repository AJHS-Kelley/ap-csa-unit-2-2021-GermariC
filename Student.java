import java.util.Scanner;

// Unit 2, Topic 1, Classes and Objects, Germari Cull, 11/3/21, v0.2

public class Student {
    // THESE ARE INSTANCE VARIABLES
    private int studentID;
    private int gradeLevel;
    private double gradePointAverage;
    private String studentName;
}

    // Creating a Constructor
    public Student() {
        this.studentID = 0;
        this.gradeLevel = 0;
        this.gradePointAverage = 0.0;
        this.studentName = "";
        // Generally this type of constructor makes a default copy.
    }

    // Value Constructor
    public Student(int studentID, int gradeLevel, double GPA, String studentName) {
        this.studentID = studentID;
        this.gradeLevel = gradeLevel;
        this.gradePointAverage = GPA;
        this.studentName = studentName;

    }

    public Student(int studentID, String studentame) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.gradeLevel = 10;
        this.gradePointAverage = 3.8;

    }

    public static void main(String[] args){
        Student student0 = new Student();
        Student student1 = new Student(11025564, 12, 0.34, "Kali Stevens");
    }
