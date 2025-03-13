package edu.miu.cs.cs425.lab10.service;

import edu.miu.cs.cs425.lab10.model.Student;
import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student saveStudent(Student student);
    Student getStudentById(Long id);
    void deleteStudentById(Long id);
}