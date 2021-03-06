/*
 * Copyright 2012-2013 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.s3s.ssm.service;

import java.util.List;
import java.util.Map;

import com.s3s.ssm.dto.ProductDto;
import com.s3s.ssm.dto.ProductTypeDto;

public interface IProductService {
  List<ProductDto> findAll();

  List<ProductDto> getSellableProduct();

  Map<ProductTypeDto, List<ProductDto>> getSellableProductTypes();

  List<ProductTypeDto> getProductTypeDto();

  Map<String, Double> getQuantityInStock(List<ProductDto> productDtos);

  Map<ProductTypeDto, List<ProductDto>> getAllProductTypes();

  Map<ProductTypeDto, List<ProductDto>> getAllMaterialTypes();
}
