package com.aust.c_language.base.service;

import com.aust.c_language.base.constant.ConstantsForDomain;
import com.aust.c_language.base.domain.CorUser;
import com.aust.c_language.base.domain.Course;
import com.aust.c_language.base.mapper.CoruserMapper;
import com.aust.c_language.base.mapper.CourseMapper;
import com.aust.c_language.base.util.CommonUtil;
import com.aust.c_language.base.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
    @Autowired
    private CourseMapper courseMapper;
    @Autowired
    private CoruserMapper coruserMapper;

   public void getCourseInfoById(Integer id){
       CommonUtil.checkParameters(id);
       Course course = courseMapper.findCourseById(id);
       CorUser teacherId = coruserMapper.findCorUserByCouIdAndUserRole(course.getId(),
               ConstantsForDomain.ROLE_TEACHER);

   }
}
