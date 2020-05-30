package com.aust.c_language.base.service;

import com.aust.c_language.base.constant.ConstantsForDomain;
import com.aust.c_language.base.domain.Profit;
import com.aust.c_language.base.domain.User;
import com.aust.c_language.base.mapper.ProfitMapper;
import com.aust.c_language.base.mapper.UserMapper;
import com.aust.c_language.base.vo.profit.ProfitVo;
import com.aust.c_language.base.vo.user.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProfitService {
    @Autowired
    private ProfitMapper profitMapper;

    public List<ProfitVo> findProfitList(Integer page, Integer pageSize){
        List<Profit> list = profitMapper.findProfitsByPage(page, pageSize);
        List<ProfitVo> vos = new ArrayList<>();
        for (Profit profit: list){
            vos.add(ProfitVo.of(profit));
        }
        return vos;
    }
}
