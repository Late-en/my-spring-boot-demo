package actuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Late-en
 * Actuator提供一些端点（如/actuator/beans）用于反应一些应用内部信息
 * 只需要在pom.xml中引用并在application中配置一些信息即可使用
 */
@SpringBootApplication
public class ActuatorApplication {
    public static void main(String[] args) {
        SpringApplication.run(ActuatorApplication.class, args);
    }
}
