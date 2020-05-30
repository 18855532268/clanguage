package com.aust.c_language.base.service;

import com.aust.c_language.base.domain.Project;
import com.aust.c_language.base.mapper.ProjectMapper;
import com.aust.c_language.base.vo.project.ProjectVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    @Autowired
    private ProjectMapper projectMapper;

    public List<ProjectVo> getProjectList(Integer page, Integer pageSize){
        List<Project> list = projectMapper.findProjectsByPage(page, pageSize);
        return ProjectVo.of(list);
    }
}
