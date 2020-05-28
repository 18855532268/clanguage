package com.aust.c_language.base.domain.entity;

import java.io.Serializable;

/**
 * 课程表(Course)实体类
 *
 * @author makejava
 * @since 2020-05-29 00:07:47
 */
public class Course implements Serializable {
    private static final long serialVersionUID = 924309948274959028L;
    
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
    /**
    * 课程公告
    */
    private String announ;
    
    private Integer status;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTeacher() {
        return teacher;
    }

    public void setTeacher(Integer teacher) {
        this.teacher = teacher;
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getAnnoun() {
        return announ;
    }

    public void setAnnoun(String announ) {
        this.announ = announ;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}