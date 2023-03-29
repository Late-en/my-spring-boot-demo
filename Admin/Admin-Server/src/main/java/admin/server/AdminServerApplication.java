package admin.server;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Late-en
 * spring-boot-admin用于管理和监控 Spring Boot 应用程序
 * actuator 缺少可视化的界面，配合 admin 有更好的效果
 * 这是 admin 服务端
 */

@EnableAdminServer
@SpringBootApplication
public class AdminServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminServerApplication.class, args);
    }
}
