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

package com.s3s.ssm.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.remoting.caucho.HessianServiceExporter;

import com.s3s.ssm.service.ISequenceNumberService;

@Configuration
@ComponentScan(basePackages = "com.s3s.ssm.service")
@EnableAutoConfiguration
@Import(InfrastructureConfig.class)
@EnableJpaRepositories(basePackages = "com.s3s.ssm.repo")
public class SequenceNumberServiceConfig {
	
  @Autowired
  private ISequenceNumberService sequenceNumberService;
  

  @Bean(name = "/SequenceNumberService")
  public HessianServiceExporter hessianSequenceNumberServiceExporter() {
    HessianServiceExporter exporter = new HessianServiceExporter();
    exporter.setService(this.sequenceNumberService);
    exporter.setServiceInterface(ISequenceNumberService.class);
    return exporter;
  }

}
