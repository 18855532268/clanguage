package com.aust.c_language.base.service;

import com.aust.c_language.base.constant.Constants;
import com.aust.c_language.base.constant.ConstantsForDomain;
import com.aust.c_language.base.domain.Project;
import com.aust.c_language.base.domain.User;
import com.aust.c_language.base.mapper.UserMapper;
import com.aust.c_language.base.vo.user.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List<UserVo> findUsersByRoleAndList(Integer page, Integer pageSize){
        List<User> list = userMapper.findUsersByRoleAndPage(ConstantsForDomain.ROLE_TEACHER,page, pageSize);
        List<UserVo> vos = new ArrayList<>();
        for (User user: list){
            vos.add(UserVo.of(user));
        }
        return vos;
    }
}
