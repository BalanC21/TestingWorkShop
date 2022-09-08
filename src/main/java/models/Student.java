package models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private final String studentId;
    private String name;

    private LocalDate birthDate;
    private LocalDate enrollment;
    private double courseFee;
    private Module currentModule;
    private List<Module> moduleHistory;

    public Student(String studentId, String name, LocalDate birthDate, LocalDate enrollment, Module currentModule) {
        this.studentId = studentId;
        this.name = name;
        this.birthDate = birthDate;
        this.enrollment = enrollment;
        this.courseFee = 5_000;
//        this(studentId, name, birthDate,enrollment, 5_000);
        this.currentModule = currentModule;
        this.moduleHistory = new ArrayList<>();
    }

    public Student(String studentId, String name, LocalDate birthDate, LocalDate enrollment) {
        this.studentId = studentId;
        this.name = name;
        this.birthDate = birthDate;
        this.enrollment = enrollment;
        this.courseFee = 5_000;
    }

    public LocalDate getEnrollment() {
        return enrollment;
    }

    public double getCourseFee() {
        return courseFee;
    }

    public void setCourseFee(double courseFee) {
        this.courseFee = courseFee;
    }

    public void setCurrentModule(Module currentModule) {
        this.currentModule = currentModule;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", enrollment=" + enrollment +
                ", courseFee=" + courseFee +
                ", currentModule=" + currentModule +
                ", moduleHistory=" + moduleHistory +
                '}';
    }
}
