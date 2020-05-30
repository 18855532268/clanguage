package com.aust.c_language.base.mapper;

import com.aust.c_language.base.constant.ConstantsForDomain;
import com.aust.c_language.base.domain.CorUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoruserMapper extends JpaRepository<CorUser,Integer> {

    CorUser findCorUserByCouIdAndUserRole(Integer userId,Integer role);
}
