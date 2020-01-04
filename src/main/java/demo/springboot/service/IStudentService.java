package demo.springboot.service;

import demo.springboot.domain.Student;

import java.util.List;

/**
 * @author zhang
 * @description
 * @date 2020/1/4 11:49
 */
public interface IStudentService {
    List<Student> list();
    Student get(Long id);
}
