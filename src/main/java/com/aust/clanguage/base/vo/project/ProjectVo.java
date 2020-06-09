package com.aust.clanguage.base.vo.project;

import com.aust.clanguage.base.domain.Project;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProjectVo {
    private String name;

    private String coverimg;

    private String details;

    public static ProjectVo of(Project project) {
        return ProjectVo.builder()
                .name(project.getName())
                .coverimg(project.getCoverimg())
                .details(project.getDetails())
                .build();
    }
    public static List<ProjectVo> of(List<Project> projects){
        ArrayList<ProjectVo> vos = new ArrayList<>();
        if (projects != null){
            for (Project project: projects){
                vos.add(ProjectVo.of(project));
            }
        }
        return vos;
    }
}
