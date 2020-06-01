package com.aust.c_language.base.controller;

import com.aust.c_language.base.exception.ErrorMessageException;
import com.aust.c_language.base.service.CourseService;
import com.aust.c_language.base.util.CommonUtil;
import com.aust.c_language.base.vo.ReturnVO;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

/**
 * 课程相关
 */
@Slf4j
@RestController
@RequestMapping("course")
public class CourseController {
    @Autowired
    private CourseService courseService;


    @GetMapping("/course/info")
    public ReturnVO getCouerseInfo(String id) {
        return ReturnVO.getSuccess();
    }

    @GetMapping("/getCourse")
    public ReturnVO getCouerse(String id) {
        return ReturnVO.getSuccess(courseService.getCourse(Integer.valueOf(id)));
    }

    @SneakyThrows
    @PostMapping("/uploadMaterials")
    public ReturnVO uploadMaterials(Integer couId, MultipartFile pointFile,MultipartFile planFile, MultipartFile lessonFile, Integer userId) {
        courseService.addMaterials(couId, pointFile, planFile, lessonFile, userId);
        return ReturnVO.getSuccess();
    }
    @GetMapping("/getMaterials")
    public ReturnVO getMaterials(Integer couId) {
        return ReturnVO.getSuccess(courseService.getMaterials(couId));
    }
}
