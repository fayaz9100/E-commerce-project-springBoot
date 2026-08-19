package com.jtspringproject.JtSpringProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
public class JtSpringProjectApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return applicationpackage com.jtspringproject.JtSpringProject;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JtSpringProjectApplicationTests {

    @Test
    void contextLoads() {
    }
}.sources(JtSpringProjectApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(JtSpringProjectApplication.class, args);
    }
}
