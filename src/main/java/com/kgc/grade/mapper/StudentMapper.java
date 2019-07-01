package com.kgc.grade.mapper;


import com.kgc.grade.entity.Student;
import com.kgc.grade.entity.StudentExample;

import java.util.List;

public interface StudentMapper {

    int deleteByPrimaryKey(Integer sid);

    int insert(Student record);

    int insertSelective(Student record);

    List<Student> selectByExample(StudentExample example);
    Student selectByPrimaryKey(Integer sid);
    int updateByPrimaryKeySelective(Student record);
    //查询某年纪下的学生
    List<Student>getStudentByGid(Integer gid);

    int updateByPrimaryKey(Student record);

     List<Student> getAllStudent();

    // public PageInfo<Student> getGradeByPage();
}