package Student_Grading_System;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int examNote;
    int oralNote;
    double averageNote;
    double examWeight;



    Course(String name, String code, String prefix, double examWeight) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.examWeight = examWeight;
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
