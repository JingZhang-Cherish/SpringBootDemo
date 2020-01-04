package demo.springboot.domain;

import java.math.BigDecimal;

/**
 * @author zhang
 * @description
 * @date 2020/1/4 11:50
 */
public class Student {
    private Long id;
    private String name;
    private Integer age;
    private BigDecimal score ;

    public Student() {
    }

    public Student(Long id, String name, Integer age, BigDecimal score) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }
}
