package com.s3s.ssm.config.hessian;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;

import com.s3s.ssm.service.IPaymentContentService;
import com.s3s.ssm.service.IPaymentService;

@Configuration
public class FinanceHessanConfig {
  private static final String SERVER_URL = "http://localhost:8080";

  @Bean(name = "paymentService")
  public HessianProxyFactoryBean hessianPaymentServiceProxyFactoryBean() {
    HessianProxyFactoryBean bean = new HessianProxyFactoryBean();
    bean.setServiceUrl(SERVER_URL + "/PaymentService");
    bean.setServiceInterface(IPaymentService.class);
    return bean;
  }
  
  @Bean(name = "paymentContentService")
  public HessianProxyFactoryBean hessianPaymentContentServiceProxyFactoryBean() {
    HessianProxyFactoryBean bean = new HessianProxyFactoryBean();
    bean.setServiceUrl(SERVER_URL + "/PaymentContentService");
    bean.setServiceInterface(IPaymentContentService.class);
    return bean;
  }
}
