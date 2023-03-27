package properties.property;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Late-en
 * 项目配置信息
 */

@Data //@Data 注解的主要作用是提高代码的简洁，使用这个注解可以省去代码中大量的get()、 set()、 toString()等方法
@ConfigurationProperties(prefix = "application")
@Component
public class ApplicationProperty {
    private String name;
    private String version;
}
