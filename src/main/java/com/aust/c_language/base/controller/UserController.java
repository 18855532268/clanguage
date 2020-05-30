package com.aust.c_language.base.controller;

import com.aust.c_language.base.constant.Constants;
import com.aust.c_language.base.service.UserService;
import com.aust.c_language.base.vo.ReturnVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getList")
    public ReturnVO getUserList(@RequestParam(defaultValue = Constants.PAGE_DEFAULT_START) Integer page,
                                   @RequestParam(defaultValue = Constants.PAGE_DEFAULT_SIZE) Integer pageSize) {
        return ReturnVO.getSuccess(userService.findUsersByRoleAndList(page, pageSize));
    }
}
