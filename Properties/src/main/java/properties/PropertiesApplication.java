package properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Late-en
 * spring-boot-configuration-processor的作用就是将自己创建的配置类生成元数据信息
 * 生成文件位置（target/classes/META-INF/spring-configuration-metadata.json）
 * 这样就能在你自己的配置文件(main/resources/application.yml)中有了显现提示
 */

@SpringBootApplication
public class PropertiesApplication {
    public static void main(String[] args) {
        SpringApplication.run(PropertiesApplication.class, args);
    }
}
