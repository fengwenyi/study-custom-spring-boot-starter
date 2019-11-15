package com.fengwenyi.study_custom_springboot_starter.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Erwin Feng<xfsy_2015@163.com>
 * @since 2019/11/15 17:19
 */
@AllArgsConstructor
public class GreetingService {

    private List<String> members;

    public void sayHello() {
        members.forEach(s -> System.out.println("Hello " + s));
    }
}
