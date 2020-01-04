package demo.springboot.controller;

import demo.springboot.domain.Student;
import demo.springboot.service.IStudentService;
import demo.springboot.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhang
 * @description
 * @date 2020/1/4 11:50
 */
@RestController
public class StudentController {
    @Autowired
    IStudentService studentServiceImpl;

    @RequestMapping(value = "/list")
    public List<Student> list() {
        return studentServiceImpl.list();
    }

    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET,produces = "application/json")
    public Student get(@PathVariable Long id) {
        return studentServiceImpl.get(id);
    }
}
