package Student_Grading_System;

public class Teacher {
    String name;
    String mobileNumber;
    String branch;

    Teacher(String name, String branch, String mobileNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.branch = branch;
    }
        void print () {
            System.out.println("Teacher Name: " + this.name);
            System.out.println("Teacher's Branch: " + this.branch);
            System.out.println("Teacher's Mobile Phone Number: " + this.mobileNumber);
        }
}
