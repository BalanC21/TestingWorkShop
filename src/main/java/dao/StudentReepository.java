package dao;

import models.Student;

import java.util.List;

public interface StudentReepository {
    void save(Student student);

    List<Student> getAll();

    Student findStudent(String studentId);

    List<Student> findRecentEnrolledStudents(int lastNumberOfDays);
}

