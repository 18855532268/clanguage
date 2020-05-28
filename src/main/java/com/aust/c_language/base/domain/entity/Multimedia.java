package com.aust.c_language.base.domain.entity;

import java.io.Serializable;

/**
 * 多媒体课件地址，参考资料地址(Multimedia)实体类
 *
 * @author makejava
 * @since 2020-05-29 00:07:50
 */
public class Multimedia implements Serializable {
    private static final long serialVersionUID = 376066324050939511L;
    
    private Integer id;
    
    private Integer couId;
    /**
    * 多媒体课件地址
    */
    private String path;
    /**
    * 课件封面
    */
    private String img;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCouId() {
        return couId;
    }

    public void setCouId(Integer couId) {
        this.couId = couId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

}