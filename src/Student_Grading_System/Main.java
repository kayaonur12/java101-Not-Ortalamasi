package Student_Grading_System;

public class Main {
    public static void main(String[] args) {

        Course Mathematics = new Course("Mathematics", "101", "MAT",0.8);
        Teacher t1 = new Teacher("Onur", "MAT", "+90 555 555 55 55");
        Mathematics.addTeacher(t1);


        Course Physics = new Course("Physics", "101", "PHY",0.7);
        Teacher t2 = new Teacher("Somur", "PHY", "+90 544 444 44 44");
        Physics.addTeacher(t2);


        Course History = new Course("History", "101", "HIS",0.6);
        Teacher t3 = new Teacher("Çamur", "HIS", "+90 533 333 33 33");
        History.addTeacher(t3);


        Student s1 = new Student("Human1", "0001", "11-F", Mathematics, Physics, History);
        s1.addBulkExamNote(56,61,97);
        s1.addBulkOralExamNote(80,100,100);
        s1.isPass();

        Student s2 = new Student("Human2", "0002","11-F",Mathematics,Physics,History);
        s2.addBulkExamNote(10,15,100);
        s2.addBulkOralExamNote(100,85,80);
        s2.isPass();

    }
}
