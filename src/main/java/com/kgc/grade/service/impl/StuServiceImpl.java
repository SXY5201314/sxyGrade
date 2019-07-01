package com.kgc.grade.service.impl;

import com.kgc.grade.entity.Student;
import com.kgc.grade.mapper.StudentMapper;
import com.kgc.grade.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StuServiceImpl implements StuService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public List<Student> getStudentByGid(Integer gid) {
        return studentMapper.getStudentByGid(gid);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentMapper.getAllStudent();
    }
}
