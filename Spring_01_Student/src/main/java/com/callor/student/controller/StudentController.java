package com.callor.student.controller;

import com.callor.student.model.StudentVO;
import com.callor.student.service.StService;
import com.callor.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentService stService;

    @ResponseBody
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<StudentVO> list(Model model) {
//        model.addAttribute("STLIST", stService.selectAll());
//        return "student/list";
        return  stService.selectAll();
    }
}
