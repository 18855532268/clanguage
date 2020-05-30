package com.aust.c_language.base.entity;

import java.io.Serializable;

/**
 * (Project)实体类
 *
 * @author makejava
 * @since 2020-05-30 14:39:10
 */
public class Project implements Serializable {
    private static final long serialVersionUID = -37283538915478601L;
    
    private Integer id;
    
    private String name;
    
    private String coverimg;
    
    private String details;
    
    private Integer teacherid;
    
    private Integer courseid;


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

    public String getCoverimg() {
        return coverimg;
    }

    public void setCoverimg(String coverimg) {
        this.coverimg = coverimg;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Integer getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(Integer teacherid) {
        this.teacherid = teacherid;
    }

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

}