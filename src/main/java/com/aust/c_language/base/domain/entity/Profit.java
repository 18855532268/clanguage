package com.aust.c_language.base.domain.entity;

import java.io.Serializable;

/**
 * 成果表，展示研究成果(Profit)实体类
 *
 * @author makejava
 * @since 2020-05-28 23:42:06
 */
public class Profit implements Serializable {
    private static final long serialVersionUID = -16521358137792547L;
    
    private Integer id;
    
    private String name;
    
    private String detail;
    /**
    * 成果封面
    */
    private String img;


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

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

}