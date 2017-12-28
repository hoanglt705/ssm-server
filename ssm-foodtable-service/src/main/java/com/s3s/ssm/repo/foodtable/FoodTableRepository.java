package com.s3s.ssm.repo.foodtable;

import org.springframework.data.repository.query.Param;

import com.s3s.entity.Area;
import com.s3s.entity.FoodTable;
import com.s3s.ssm.repo.CommonRepository;

public interface FoodTableRepository extends CommonRepository<FoodTable, Long> {
  Iterable<FoodTable> findByArea(@Param(value = "area") Area area);
}
