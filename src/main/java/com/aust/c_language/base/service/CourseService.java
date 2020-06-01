package com.aust.c_language.base.service;

import com.aust.c_language.base.constant.ConstantsForDomain;
import com.aust.c_language.base.domain.CorUser;
import com.aust.c_language.base.domain.Course;
import com.aust.c_language.base.domain.Materials;
import com.aust.c_language.base.domain.User;
import com.aust.c_language.base.exception.ErrorMessageException;
import com.aust.c_language.base.mapper.CoruserMapper;
import com.aust.c_language.base.mapper.CourseMapper;
import com.aust.c_language.base.mapper.MaterialsMapper;
import com.aust.c_language.base.util.CommonUtil;
import com.aust.c_language.base.util.Page;
import com.aust.c_language.base.vo.course.MaterialsVo;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Slf4j
@Service
public class CourseService {
    @Autowired
    private CourseMapper courseMapper;
    @Autowired
    private CoruserMapper coruserMapper;
    @Value("${upload.temp}")
    private String tempFilePath;
    @Autowired
    private MaterialsMapper materialsMapper;

    public void getCourseInfoById(Integer id) {
        CommonUtil.checkParameters(id);
        Course course = courseMapper.findCourseById(id);
        CorUser teacherId = coruserMapper.findCorUserByCouIdAndUserRole(course.getId(),
                ConstantsForDomain.ROLE_TEACHER);

    }

    // 前端测试用
    public Course getCourse(Integer id) {
        Course course = courseMapper.findCourseById(id);
        return course;
    }

    @SneakyThrows
    public void addMaterials(Integer couId, MultipartFile pointFile, MultipartFile planFile, MultipartFile lessonFile, Integer userId) {
        log.info("上传图片");
        Materials materials = new Materials();
        CommonUtil.checkParameters(couId);
        String pointPath = upload(pointFile);
        String planPath = upload(planFile);
        String lessonPath = upload(lessonFile);
        materials.setCouId(couId);
        materials.setPoint(pointPath);
        materials.setPlan(planPath);
        materials.setLesson(lessonPath);
        materials.setUserId(userId);
        materialsMapper.save(materials);
    }

    private String upload(MultipartFile file) throws IOException {
        String transFilePath = null;
        if (file != null) {
            String fileName = file.getOriginalFilename();
            if (StringUtils.isBlank(fileName)) {
                throw new ErrorMessageException("上传的文件名错误");
            }
            String substring = fileName.substring(fileName.lastIndexOf("."));
            transFilePath = tempFilePath + "/" + CommonUtil.getUUID() + "/" + fileName + substring;
            log.info("上传图片路径:{}", transFilePath);
            file.transferTo(new File(transFilePath));
        }
        return transFilePath;
    }

    public MaterialsVo getMaterials(Integer couId) {
        return MaterialsVo.of(materialsMapper.findMaterialsByCouId(couId));

    }
}
