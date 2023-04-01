package orm.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Late-en
 * 梳理一下：
 * 写好基本的application，和配置依赖
 * 连接数据库需要配置好数据源（顺便配置初始化表的sql）
 * 接下来要写crud功能
 * 写好实体类User
 * 写好基本的crud功能（UserMapper 和 xml 配置 ）
 * 最后单元测试
 */

@MapperScan("orm.mybatis.mapper")
@SpringBootApplication
public class OrmMybatisApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrmMybatisApplication.class, args);
    }
}
