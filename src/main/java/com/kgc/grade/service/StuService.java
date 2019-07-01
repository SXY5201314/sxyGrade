package com.kgc.grade.service;

import com.kgc.grade.entity.Student;

import java.util.List;

public interface StuService {
    List<Student> getStudentByGid(Integer gid);
    List<Student> getAllStudent();
}
