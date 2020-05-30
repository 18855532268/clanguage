package com.aust.c_language.base.mapper;

import com.aust.c_language.base.domain.Project;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.awt.print.Pageable;
import java.util.List;

public interface ProjectMapper extends JpaRepository<Project, Integer> {
        @Query(value = " select * from project limit ?1, ?2"
                ,nativeQuery = true)
    List<Project> findProjectsByPage(Integer page, Integer pageSize);
}
