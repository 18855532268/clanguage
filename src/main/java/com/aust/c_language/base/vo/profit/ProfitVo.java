package com.aust.c_language.base.vo.profit;

import com.aust.c_language.base.domain.Profit;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProfitVo {
    private String name;

    private String detail;
    /**
     * 成果封面
     */
    private String img;

    public static ProfitVo of(Profit profit){
        return ProfitVo.builder()
                .name(profit.getName())
                .detail(profit.getDetail())
                .img(profit.getImg())
                .build();
    }
}
