package com.abdullahcicekli.dto;

import com.abdullahcicekli.bean.BeanDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig {

    @Bean(initMethod = "initialBeanMethod", destroyMethod = "destroyBeanMethod")
    @Scope("singleton")
    public BeanDto beanDto(){
        BeanDto n1 = new BeanDto(5L,"Abdullah");
        return n1;
    }
}
