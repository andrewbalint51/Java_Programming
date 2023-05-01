package day30_inheritance.typesOfInheritance;

import java.time.LocalDateTime;

public class Student extends Person{

    private char grade;
    private String studentID;

    public Student(String name, char gender, LocalDateTime DOB, char grade, String studentID) {
        super(name, gender, DOB);
        this.grade = grade;
        this.studentID = studentID;
    }

    public void study(){

    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
}
