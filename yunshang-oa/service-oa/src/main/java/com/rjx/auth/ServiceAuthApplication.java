package com.rjx.auth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author junxi
 * @Date 2023/7/7   13:26
 * @Project yunshang-oa-parent
 * @description:
 */
@SpringBootApplication
@ComponentScan("com.rjx")
@MapperScan("com.rjx.*.mapper")
public class ServiceAuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceAuthApplication.class, args);
    }
}
