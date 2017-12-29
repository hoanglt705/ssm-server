package com.s3s.ssm.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.s3s.ssm.config.hessian.FinanceHessanConfig;
import com.s3s.ssm.config.hessian.FoodTableHessanConfig;


public class ServerContextProvider {
  private static ServerContextProvider configProvider;
  private final AnnotationConfigApplicationContext applicationContext;

  public static ServerContextProvider getInstance() {
    if (configProvider == null) {
      configProvider = new ServerContextProvider();
    }
    return configProvider;
  }

  private ServerContextProvider() {
    applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class, 
    		FinanceHessanConfig.class, FoodTableHessanConfig.class);
  }

  @Deprecated
  public AnnotationConfigApplicationContext getApplicationContext() {
    return applicationContext;
  }
}
