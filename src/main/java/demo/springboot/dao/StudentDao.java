package demo.springboot.dao;

import demo.springboot.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zhang
 * @description
 * @date 2020/1/4 11:34
 */
@Mapper
@Repository
public interface StudentDao {
    @Select("SELECT * FROM student")
    List<Student> list();
    @Select("SELECT * FROM STUDENT WHERE id=#{id}")
    Student get(Long id);
}
