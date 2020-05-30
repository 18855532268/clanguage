package com.aust.c_language.base.controller;

import com.aust.c_language.base.constant.Constants;
import com.aust.c_language.base.service.CourseService;
import com.aust.c_language.base.service.ProjectService;
import com.aust.c_language.base.vo.ReturnVO;
import com.aust.c_language.base.vo.project.ProjectVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("project")
public class ProjectController {
    @Autowired
    private CourseService courseService;
    @Autowired
    private ProjectService projectService;

    @GetMapping("/getList")
    public ReturnVO getProjectList(@RequestParam(defaultValue = Constants.PAGE_DEFAULT_START) Integer page,
                                   @RequestParam(defaultValue = Constants.PAGE_DEFAULT_SIZE) Integer pageSize) {
        return ReturnVO.getSuccess(projectService.getProjectList(page, pageSize));
    }
}
