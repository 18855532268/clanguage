package com.aust.clanguage.base.web.controller;

import com.aust.clanguage.base.constant.Constants;
import com.aust.clanguage.base.service.UserService;
import com.aust.clanguage.base.vo.ReturnVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(description = "用户管理")
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @ApiOperation(value = "获取用户list", notes = "传入page,pageSize ")
    @GetMapping("/getList")
    public ReturnVO getUserList(@RequestParam(defaultValue = Constants.PAGE_DEFAULT_START) Integer page,
                                @RequestParam(defaultValue = Constants.PAGE_DEFAULT_SIZE) Integer pageSize) {
        return ReturnVO.getSuccess(userService.findUsersByRoleAndList(page, pageSize));
    }
}
