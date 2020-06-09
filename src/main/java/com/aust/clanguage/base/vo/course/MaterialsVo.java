package com.aust.clanguage.base.vo.course;

import com.aust.clanguage.base.domain.Materials;
import com.aust.clanguage.base.util.CommonUtil;
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

    public static MaterialsVo of(Materials materials) {
        MaterialsVo build = MaterialsVo.builder()
                .build();

        if (materials.getPoint() != null) {
            build.setPoint(materials.getPoint());
            build.setPointName(CommonUtil.pathToFilename(materials.getPoint()));
        }
        if (materials.getPlan() != null) {
            build.setPlan(materials.getPlan());
            build.setPlanName(CommonUtil.pathToFilename(materials.getPlan()));
        }
        if (materials.getLesson() != null) {
            build.setLesson(materials.getLesson());
            build.setLessonName(CommonUtil.pathToFilename(materials.getLesson()));
        }
        return build;
    }

    public static List<MaterialsVo> of(List<Materials> materials){
        ArrayList<MaterialsVo> vos = new ArrayList<>();
        if (materials != null){
            for (Materials materials1 : materials){
                vos.add(MaterialsVo.of(materials1));
            }
        }
        return vos;
    }
}
