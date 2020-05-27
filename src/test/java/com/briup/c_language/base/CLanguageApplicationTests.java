package com.briup.c_language.base;

import com.briup.c_language.base.domain.Course;
import com.briup.c_language.base.mapper.CourseMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import com.alibaba.fastjson.JSONObject;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {CLanguageApplication.class})
public class CLanguageApplicationTests {
    @Autowired
    private CourseMapper courseMapper;

    @Test
    public void Test1() {
        Course courseById = courseMapper.findCourseById(1);
        log.info("课程:{}", courseById);
    }

}
