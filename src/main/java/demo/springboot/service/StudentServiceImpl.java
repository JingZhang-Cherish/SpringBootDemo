package demo.springboot.service;

import demo.springboot.dao.StudentDao;
import demo.springboot.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author zhang
 * @description
 * @date 2020/1/4 11:53
 */
@Transactional
@Service
public class StudentServiceImpl implements IStudentService {
    @Autowired
    StudentDao studentDao;

    @Override
    public List<Student> list() {
        return studentDao.list();
    }

    @Override
    public Student get(Long id) {
        return studentDao.get(id);
    }
}
