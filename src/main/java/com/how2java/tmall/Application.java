package com.how2java.tmall;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class Application {
    //访问的测试地址
    //http://localhost:8080/tmall_springboot/admin
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);    
    }
}