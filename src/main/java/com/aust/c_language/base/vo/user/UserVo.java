package com.aust.c_language.base.vo.user;

import com.aust.c_language.base.domain.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserVo {
    private String name;
    /**
     * 英文名
     */
    private String englishName;

    private String img;

    private String tel;

    private String email;
    public static UserVo of(User user){
        return UserVo.builder()
                .name(user.getName())
                .englishName(user.getEnglishName())
                .img(user.getImg())
                .tel(user.getTel())
                .email(user.getEmail())
                .build();
    }
}
