package com.aust.clanguage.base.mapper;

import com.aust.clanguage.base.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserMapper extends JpaRepository<User ,Integer> {
    @Query(value = " select * from user u where u.ROLE = ?1 limit ?2, ?3"
            ,nativeQuery = true)
    List<User> findUsersByRoleAndPage(Integer role, Integer page, Integer pageSize);
}
