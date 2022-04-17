package com.study.module_demo4;

import com.study.module_demo4.controller.BookController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ModuleDemo4Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext cac = SpringApplication.run(ModuleDemo4Application.class, args);
        BookController bc = cac.getBean(BookController.class);
        System.out.println("Bean:"+bc);
    }
}
