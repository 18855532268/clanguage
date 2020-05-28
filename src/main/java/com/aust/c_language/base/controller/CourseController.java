package com.aust.c_language.base.controller;

import com.aust.c_language.base.service.CourseService;
import com.aust.c_language.base.vo.ReturnVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 课程相关
 */
@RestController
@RequestMapping("course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping("/course/info")
    public ReturnVO getCouerseInfo(String id) {
        return ReturnVO.getSuccess();
    }
}
