package com.aust.clanguage.base.vo.course;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CourseInfoVo {
    /**
     * 课程介绍
     */
    private String courseIntroduce;
    private String courseAnnoun;
    /**
     * 师资队伍
     */
//    private List<TeacherVo> teacherTroops;
//    private

}
