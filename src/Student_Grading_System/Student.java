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

    void addBulkExamNote(int c1_exam_note, int c2_exam_note, int c3_exam_note) {
        if (c1_exam_note >= 0 && c1_exam_note <= 100)
            c1.examNote = c1_exam_note;
        if (c2_exam_note >= 0 && c2_exam_note <= 100)
            c2.examNote = c2_exam_note;
        if (c3_exam_note >= 0 && c3_exam_note <= 100)
            c3.examNote = c3_exam_note;
    }

    void addBulkOralExamNote(int c1_oral_note, int c2_oral_note, int c3_oral_note) {
        if (c1_oral_note >= 0 && c1_oral_note <= 100)
            c1.oralNote = c1_oral_note;
        if (c2_oral_note >= 0 && c2_oral_note <= 100)
            c2.oralNote = c2_oral_note;
        if (c3_oral_note >= 0 && c3_oral_note <= 100)
            c3.oralNote = c3_oral_note;
    }

    void printNote() {
        System.out.println(this.c1.name + " written exam note is: " + this.c1.examNote + " - oral exam note is:" + this.c1.oralNote + " and average note is: " + this.c1.averageNote);
        System.out.println(this.c2.name + " written exam note is: " + this.c2.examNote + " - oral exam note is:" + this.c2.oralNote + " and average note is: " + this.c2.averageNote);
        System.out.println(this.c3.name + " written exam note is: " + this.c3.examNote + " - oral exam note is:" + this.c3.oralNote + " and average note is: " + this.c3.averageNote);
        System.out.println("Overall average is:" + this.average);
    }

    void averageNote() {
        this.c1.averageNote = ((this.c1.examNote * this.c1.examWeight) + (this.c1.oralNote * (1 - c1.examWeight)));
        this.c2.averageNote = ((this.c2.examNote * this.c2.examWeight) + (this.c2.oralNote * (1 - c2.examWeight)));
        this.c3.averageNote = ((this.c3.examNote * this.c3.examWeight) + (this.c3.oralNote * (1 - c3.examWeight)));
    }

    void isPass() {
        averageNote();
        this.average = ((this.c1.averageNote + this.c2.averageNote + this.c3.averageNote) / 3.0);

        if (this.average > 60)
            System.out.println(this.stuNo + " " + this.name + " Passed the class!");
        else
            System.out.println(this.stuNo + " " + this.name + " Couldn't Passed the class!");
        printNote();
        System.out.println("-------------");
    }
}