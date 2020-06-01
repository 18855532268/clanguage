package com.aust.c_language.base.mapper;

import com.aust.c_language.base.domain.Materials;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaterialsMapper extends JpaRepository<Materials, Integer> {
    Materials findMaterialsByCouId(Integer couId);
}
