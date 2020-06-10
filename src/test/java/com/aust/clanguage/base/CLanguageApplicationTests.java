//package com.aust.c_language.base;
//
//import Course;
//import Project;
//import CourseMapper;
//import ProjectMapper;
//import ProfitService;
//import UserService;
//import ProfitVo;
//import UserVo;
//import lombok.extern.slf4j.Slf4j;
//
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.awt.print.Pageable;
//import java.util.List;
//
//@Slf4j
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = {CLanguageApplication.class})
//public class CLanguageApplicationTests {
//    @Autowired
//    private CourseMapper courseMapper;
//    @Autowired
//    private ProjectMapper projectMapper;
//    @Autowired
//    private ProfitService profitService;
//    @Autowired
//    private UserService userService;
//
//    @Test
//    public void Test1() {
////        Pageable pageable = new Pageable();
//        List<ProfitVo> page = profitService.findProfitList(0, 4);
//
//        log.info("返回:{}", page);
//    }
//    @Test
//    public void Test2() {
////        Pageable pageable = new Pageable();
//        List<UserVo> page = userService.findUsersByRoleAndList(0, 4);
//
//        log.info("返回:{}", page);
//    }
//    @Test
//    public void Test3() {
////        Pageable pageable = new Pageable();
//        String path = "46546448979/46549879/110";
//        String substring = path.substring(path.lastIndexOf("/") +1);
//
//        log.info("返回:{}", substring);
//    }
//
//}
