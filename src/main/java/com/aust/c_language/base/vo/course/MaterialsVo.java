package com.aust.c_language.base.vo.course;

import com.aust.c_language.base.domain.Materials;
import com.aust.c_language.base.util.CommonUtil;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MaterialsVo {

    /**
     * 教学大纲文件地址
     */
    private String point;
    private String pointName;
    /**
     * 授课计划文件地址
     */
    private String plan;
    private String planName;
    /**
     * 课程教案文件地址
     */
    private String lesson;
    private String lessonName;

    public static MaterialsVo of(Materials materials){
        return MaterialsVo.builder()
                .point(materials.getPoint())
                .pointName(CommonUtil.pathToFilename(materials.getPoint()))
                .plan(materials.getPlan())
                .planName(CommonUtil.pathToFilename(materials.getPlan()))
                .lesson(materials.getLesson())
                .lessonName(CommonUtil.pathToFilename(materials.getLesson()))
                .build();
    }
 }
