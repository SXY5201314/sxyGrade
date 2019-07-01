package com.kgc.grade.controller;

import com.kgc.grade.entity.Grade;
import com.kgc.grade.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class GradeController {
@Autowired
    private GradeService gradeService;
@RequestMapping("/getAllGrade")
    public String getAllGrade(Model model){
    List<Grade> gradeList = gradeService.getAllGrade();
    model.addAttribute("gradeList",gradeList);
    return "gradeList";
    }
    @RequestMapping("/delGrade")
    public String delGrade(Integer gid) {
        int i = gradeService.deleteByPrimaryKey(gid);
        if (i < 0)
            return "error";
        else
            return "redirect:getAllGrade";
    }
    @RequestMapping("/addGrade")
    public String addGrade(Grade grade){
        int i = gradeService.insertSelective(grade);
        if (i<0)
            return "error";
        else
        return "redirect:getAllGrade";
    }
    @RequestMapping("/getGrade")
    public String getGrade(Integer gid,Model model){
    //调用业务
    Grade grade = gradeService.selectByPrimaryKey(gid);
        //将控制器的数据传递到视图
        model.addAttribute("grade",grade);
        return "update";
    }
    @RequestMapping("/updateGrade")
    public String updateGrade(Grade grade,Model model){
        //调用业务
        gradeService.updateByPrimaryKey(grade);
         //将控制器的数据传递到视图
        return "redirect:getAllGrade";
    }
    @RequestMapping("/getData")
    @ResponseBody
    public List<Grade> getData(){
    //调用业务查询所有学生
        List<Grade> gradeList = gradeService.getAllGrade();
        return gradeList;
    }


}
