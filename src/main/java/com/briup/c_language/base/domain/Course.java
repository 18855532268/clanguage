package com.briup.c_language.base.domain;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * course
 * @author 
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "course")
public class Course implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    /**
     * 授课教师ID
     */
    private Integer teacher;

    /**
     * 课程标号唯一
标号格式为：学院标号_专业标号_教师标号_随机码
（AAAA_BBBB_CCCC_DDDD）
     */
    private Integer no;

    /**
     * 封面图片地址
     */
    private String logo;

    private String introduce;

    private static final long serialVersionUID = 1L;
}