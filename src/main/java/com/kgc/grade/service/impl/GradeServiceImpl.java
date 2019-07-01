package com.kgc.grade.service.impl;

import com.kgc.grade.entity.Grade;
import com.kgc.grade.entity.GradeExample;
import com.kgc.grade.mapper.GradeMapper;
import com.kgc.grade.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional//实现事务支持
public class GradeServiceImpl implements GradeService {
    @Autowired
    private GradeMapper gradeMapper;
    @Override

    public int deleteByPrimaryKey(Integer gid) {
        return gradeMapper.deleteByPrimaryKey(gid);
    }

    @Override
    public int insert(Grade record) {
        return gradeMapper.insert(record);
    }

    @Override
    public int insertSelective(Grade record) {
        return gradeMapper.insertSelective(record);
    }

    @Override
    public List<Grade> selectByExample(GradeExample example) {
        return null;
    }

    @Override
    public Grade selectByPrimaryKey(Integer gid) {
        return gradeMapper.selectByPrimaryKey(gid);
    }

    @Override
    public int updateByPrimaryKeySelective(Grade record) {
        return gradeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Grade record) {
        return gradeMapper.updateByPrimaryKey(record);
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Grade> getAllGrade() {

        return gradeMapper.getAllGrade();
    }
}
