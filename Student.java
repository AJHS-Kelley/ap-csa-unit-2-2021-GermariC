import java.util.Scanner;

// Unit 2, Topic 1, Classes and Objects, Germari Cull, 11/5/21, v0.6

public class Student {
    // THESE ARE INSTANCE VARIABLES
    private int studentID;
    private int gradeLevel;
    private double gradePointAverage;
    private String studentName;

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
        // More than one constructor is known as OVERLOADING

    }

    // Creating Methods

    public static void calcGPA() {
        int grade0;
        int grade1;
        int grade2;
        int grade3;
        double newGPA;

        Scanner myScanner = new Scanner(System.in);

        System.out.println("What is the first grade?");
        grade0 = myScanner.nextInt();
        System.out.println("What is the second grade?");
        grade1 = myScanner.nextInt();
        System.out.println("What is the third grade?");
        grade2 = myScanner.nextInt();
        System.out.println("What is the fourth grade?");
        grade3 = myScanner.nextInt();

        newGPA = (grade0 + grade1 + grade2 + grade3) / 4;
        System.out.print("The new GPA is");
        System.out.println(newGPA);
    }

    public static void newLine() {
        newLine();
        newLine();
        newLine();
    }

    // Parameters and Arguments
    public static void assignLunch(int gradeLevel) {
        String lunchPeriod;

        if (gradeLevel == 9) {
            lunchPeriod = "First Lunch";
            System.out.print("This student has ");
            System.out.println(lunchPeriod);
        } else if (gradeLevel == 10) {
            lunchPeriod = "Second Lunch";
            System.out.print("This student has ");
            System.out.println(lunchPeriod);
        } else if (gradeLevel == 11) {
            lunchPeriod = "Third Lunch";
            System.out.print("This student has ");
            System.out.println(lunchPeriod);
        } else {
            lunchPeriod = "Off-Campus Lunch";
            System.out.print("This student has ");
            System.out.println(lunchPeriod);
        }

    }

    public static void main(String[] args) {
        /*
         * Student student0 = new Student(); Student student1 = new Student(11025564,
         * 12, 0.34, "Kali Stevens");
         * 
         * System.out.println("Well Hello there!"); threeLine();
         * System.out.println("General Kenobi."); calcGPA();
         */

        assignLunch(9);
    }
}