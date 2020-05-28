package com.aust.c_language.base.domain.entity;

import java.io.Serializable;

/**
 * 项目成果和用户关联表(ProUser)实体类
 *
 * @author makejava
 * @since 2020-05-28 23:42:06
 */
public class ProUser implements Serializable {
    private static final long serialVersionUID = -16231471265213071L;
    
    private Integer id;
    
    private Integer proId;
    
    private Integer userId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

}