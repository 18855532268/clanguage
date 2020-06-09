package com.aust.clanguage.base.web.controller;

import com.aust.clanguage.base.constant.Constants;
import com.aust.clanguage.base.service.ProfitService;
import com.aust.clanguage.base.vo.ReturnVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("profit")
public class ProfitControllrt {
    @Autowired
    private ProfitService profitService;

    @GetMapping("/getList")
    public ReturnVO getProfitList(@RequestParam(defaultValue = Constants.PAGE_DEFAULT_START) Integer page,
                                   @RequestParam(defaultValue = Constants.PAGE_DEFAULT_SIZE) Integer pageSize) {
        return ReturnVO.getSuccess(profitService.findProfitList(page, pageSize));
    }
}
