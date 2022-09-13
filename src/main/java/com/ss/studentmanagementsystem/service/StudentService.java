package com.ss.studentmanagementsystem.service;

import com.ss.studentmanagementsystem.entity.Student;
import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);
}
