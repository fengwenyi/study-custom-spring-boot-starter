package com.fengwenyi.study_custom_springboot_starter.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Erwin Feng<xfsy_2015@163.com>
 * @since 2019/11/15 17:25
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "erwin.greeting")
public class GreetingProperties {

    /**
     * GreetingProperties 开关
     */
    private Boolean enable = false;

    /**
     * 需要打招呼的成员列表
     */
    private List<String> members = new ArrayList<>();
}
