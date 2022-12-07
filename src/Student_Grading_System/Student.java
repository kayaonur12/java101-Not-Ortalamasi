package Student_Grading_System;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double average;


    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;

    }

    void addBulkExamNote(int c1_note, int c2_note, int c3_note) {
        if (c1_note >= 0 && c1_note <= 100)
            c1.note = c1_note;
        if (c2_note >= 0 && c2_note <= 100)
            c2.note = c2_note;
        if (c3_note >= 0 && c3_note <= 100)
            c3.note = c3_note;
    }

    void printNote() {
        System.out.println(this.c1.name + " average note is: " + this.c1.note);
        System.out.println(this.c2.name + " average note is: " + this.c2.note);
        System.out.println(this.c3.name + " average note is: " + this.c3.note);
        System.out.println("Overall average is:" + this.average);
    }

    void isPass() {
        this.average = ((this.c1.note + this.c2.note + this.c3.note) / 3.0);
        printNote();
        if (this.average > 60)
            System.out.println(this.stuNo+ " "+this.name + " Passed the class!");
        else
            System.out.println(this.stuNo+ " "+this.name + " Couldn't Passed the class!");
        System.out.println("-------------");
    }
}