package com.csy.web.web.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ThymeleafTemplateConfig {

    @Bean
    @ConditionalOnMissingBean
    public RiskDialect getViewResolver(){
       return new RiskDialect();
    }

}
