package com.how2java.tmall;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class Application {
    //访问的测试地址           http://localhost:8080/tmall_springboot/admin
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        /**
         *   .   ____          _            __ _ _1
         *  /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \2
         * ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \3
         *  \\/  ___)| |_)| | | | | || (_| |  ) ) ) )4
         *   '  |____| .__|_| |_|_| |_\__, | / / / /
         *  =========|_|==============|___/=/_/_/_/
         *  :: Spring Boot ::        (v1.5.9.RELEASE)
         */
        System.out.println("   .   ____          _            __ _ _");
        System.out.println("  /\\\\ / ___'_ __ _ _(_)_ __  __ _ \\ \\ \\ \\");
        System.out.println(" ( ( )\\___ | '_ | '_| | '_ \\/ _` | \\ \\ \\ \\");
        System.out.println("  \\\\/  ___)| |_)| | | | | || (_| |  ) ) ) )");
        System.out.println("   '  |____| .__|_| |_|_| |_\\__, | / / / /");
        System.out.println("  =========|_|==============|___/=/_/_/_/");
        System.out.println(" :: Spring Boot :: start success！");
    }
}