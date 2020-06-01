//package com.aust.c_language.base;
//
//import com.aust.c_language.base.domain.Course;
//import com.aust.c_language.base.domain.Project;
//import com.aust.c_language.base.mapper.CourseMapper;
//import com.aust.c_language.base.mapper.ProjectMapper;
//import com.aust.c_language.base.service.ProfitService;
//import com.aust.c_language.base.service.UserService;
//import com.aust.c_language.base.vo.profit.ProfitVo;
//import com.aust.c_language.base.vo.user.UserVo;
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
