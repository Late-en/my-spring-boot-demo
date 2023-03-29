package logback;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author Late-en
 * logback只需要简单的引用,关键在于理解logback-spring.xml的配置
 */

@SpringBootApplication
@Slf4j
public class LogbackApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(LogbackApplication.class, args);
        int length = context.getBeanDefinitionNames().length;
        log.trace("Spring boot启动初始化了 {} 个 Bean", length);
        log.debug("Spring boot启动初始化了 {} 个 Bean", length);
        // 配置中日志级别为info,只会打印以下信息
        log.info("Spring boot启动初始化了 {} 个 Bean", length);
        log.warn("Spring boot启动初始化了 {} 个 Bean", length);
        log.error("Spring boot启动初始化了 {} 个 Bean", length);
        try {
            int i = 0;
            int j = 1 / i;
        } catch (Exception e) {
            log.error("【LogbackApplication】启动异常：", e);
        }
    }
}
