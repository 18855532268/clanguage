package com.aust.clanguage.base.mapper;

import com.aust.clanguage.base.domain.Materials;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MaterialsMapper extends JpaRepository<Materials, Integer> {
    List<Materials> findMaterialsByCouId(Integer couId);
}
