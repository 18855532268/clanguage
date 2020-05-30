package com.aust.c_language.base.mapper;

import com.aust.c_language.base.domain.Profit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProfitMapper extends JpaRepository<Profit, Integer> {
    @Query(value = " select * from profit limit ?1, ?2"
            ,nativeQuery = true)
    List<Profit> findProfitsByPage(Integer page, Integer pageSize);
}
