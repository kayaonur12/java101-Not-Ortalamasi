package Student_Grading_System;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;


    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
    }

    void addTeacher(Teacher teacher) {
        if (this.prefix.equals(teacher.branch)) {
            this.teacher = teacher;
        } else
            System.out.println(teacher.name+"'s branch and "+this.name+" is not matching.");


    }

    void CourseID() {
        String CourseID = this.prefix + this.code;
    }

    void printTeacher() {
        this.teacher.print();
    }

}
