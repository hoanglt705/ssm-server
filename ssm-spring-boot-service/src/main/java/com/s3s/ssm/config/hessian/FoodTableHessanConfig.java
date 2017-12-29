package com.s3s.ssm.config.hessian;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;

import com.s3s.ssm.service.IAreaService;
import com.s3s.ssm.service.IFoodTableService;

@Configuration
public class FoodTableHessanConfig {
  private static final String SERVER_URL = "http://localhost:8080";

  @Bean(name = "foodTableService")
  public HessianProxyFactoryBean hessianFoodTableProxyFactoryBean() {
    HessianProxyFactoryBean bean = new HessianProxyFactoryBean();
    bean.setServiceUrl(SERVER_URL + "/FoodTableService");
    bean.setServiceInterface(IFoodTableService.class);
    return bean;
  }
  
  @Bean(name = "areaService")
  public HessianProxyFactoryBean hessianAreaProxyFactoryBean() {
    HessianProxyFactoryBean bean = new HessianProxyFactoryBean();
    bean.setServiceUrl(SERVER_URL + "/AreaService");
    bean.setServiceInterface(IAreaService.class);
    return bean;
  }
}
