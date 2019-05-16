package com.events.driven;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = "com.events.*")
@MapperScan("com.events.mapper")
public class EventDrivenApplication extends SpringBootServletInitializer{

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(EventDrivenApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(EventDrivenApplication.class, args);
    }

}
