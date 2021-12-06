import java.util.Scanner;

// Unit 2, Topic 1, Classes and Objects, Germari Cull, 12/6/21, v0.10

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

    public static void assignLunchMultiple(int gradeLevel, double gradePointAverage) {
        String lunchPeriod;
        // AND, OR, NOT -- Boolean Operators
        // && -- AND
        // || -- or
        // | -- NOT

        if (gradeLevel == 9 || gradePointAverage <= 1.5) {
            lunchPeriod = "First Lunch";
            System.out.print("This student has ");
            System.out.println(lunchPeriod);
        } else if (gradeLevel == 10 && gradePointAverage > 2.0) {
            lunchPeriod = "Second Lunch";
            System.out.print("This student has ");
            System.out.println(lunchPeriod);
        } else if (gradeLevel == 11 | gradePointAverage != 0.0) {
            lunchPeriod = "Third Lunch";
            System.out.print("This student has ");
            System.out.println(lunchPeriod);
        } else {
            lunchPeriod = "Off-Campus Lunch";
            System.out.print("This student has ");
            System.out.println(lunchPeriod);
        }

    }

    public static void mathPractice() {
        int x;
        int y;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter two integers and press enter.\n");
        x = myScanner.nextInt();
        y = myScanner.nextInt();
        System.out.println(Math.min(x, y));

        int lowest;
        lowest = Math.min(x, y);
        System.out.println(lowest);

        System.out.println("Next we will use Math.pow() to calculate.\n");
        System.out.println(Math.pow(x, y));

        double exponents;
        exponents = Math.pow(x, y);
        System.out.println(exponents);

        System.out.println("Next we will use Math.random().\n");
        System.out.println(Math.random());

        double percentage;
        percentage = (Math.random() * 100);
        System.out.print("There is a ");
        System.out.print(percentage);
        System.out.println("% chance of rain today.\n");

    }

    public static double getGPA(){
        int grade0, grade1, grade2 

        grade0 = 75;
        grade1 = 50;
        grade2 = 62;

        double fakeGPA;
        fakeGPA = (grade0 + grade1 + grade2) / 3;

    }

    public static void main(String[] args) {
        /*
         * 
         * 
         * assignLunchMultiple(10, 1.45); assignLunchMultiple(11, 2.5);
         */

        mathPractice();

    }
}