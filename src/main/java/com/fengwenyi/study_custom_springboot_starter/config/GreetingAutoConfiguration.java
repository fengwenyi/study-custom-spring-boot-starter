package com.fengwenyi.study_custom_springboot_starter.config;

import com.fengwenyi.study_custom_springboot_starter.bean.User;
import com.fengwenyi.study_custom_springboot_starter.properties.GreetingProperties;
import com.fengwenyi.study_custom_springboot_starter.service.GreetingService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Erwin Feng<xfsy_2015@163.com>
 * @since 2019/11/15 17:18
 */
@Configuration
@ConditionalOnProperty(value = "erwin.greeting.enable", havingValue = "true")
@ConditionalOnClass(User.class)
public class GreetingAutoConfiguration {

    @Bean
    public GreetingService greetingService(GreetingProperties greetingProperties) {
        return new GreetingService(greetingProperties.getMembers());
    }
}
