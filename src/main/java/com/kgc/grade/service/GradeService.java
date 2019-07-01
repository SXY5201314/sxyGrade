package com.kgc.grade.service;

import com.kgc.grade.entity.Grade;
import com.kgc.grade.entity.GradeExample;

import java.util.List;

public interface GradeService {
    int deleteByPrimaryKey(Integer gid);

    int insert(Grade record);

    int insertSelective(Grade record);

    List<Grade> selectByExample(GradeExample example);

    Grade selectByPrimaryKey(Integer gid);

    int updateByPrimaryKeySelective(Grade record);

    int updateByPrimaryKey(Grade record);
    List<Grade> getAllGrade();
}
