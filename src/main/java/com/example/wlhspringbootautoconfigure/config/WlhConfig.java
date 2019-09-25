package com.example.wlhspringbootautoconfigure.config;

import com.example.wlhspringbootautoconfigure.properties.WlhProperties;
import com.example.wlhspringbootautoconfigure.service.WlhService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(WlhService.class)
@EnableConfigurationProperties(WlhProperties.class)
public class WlhConfig {

    private final WlhProperties wlhProperties;

    public WlhConfig(WlhProperties wlhProperties){
        this.wlhProperties=wlhProperties;
    }
    @Bean
    @ConditionalOnMissingBean
    public WlhService helloService(){
        return new WlhService(wlhProperties);
    }

}
