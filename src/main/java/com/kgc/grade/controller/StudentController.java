package com.kgc.grade.controller;

import com.kgc.grade.entity.Student;
import com.kgc.grade.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StuService stuService;

    @RequestMapping("/showStudent")
    public String showStudent(Integer gid, Model model) throws Exception {
        //通过年纪编号显示学生
        List<Student> list = stuService.getStudentByGid(gid);
        model.addAttribute("list", list);
        return "list";
    }

    @RequestMapping("/showData")
    @ResponseBody
    public List<Student> showData() throws Exception {
        //通过年纪编号显示学生
        List<Student> list = stuService.getAllStudent();
        return list;
    }
}
