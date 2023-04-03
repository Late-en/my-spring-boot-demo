package orm.mybatisPlus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Late-en
 * mybatis plus 内置了baseMapper,baseService,page插件等等
 * 通过配置文件注入到spring中使用
 * 同时还用到了metaObjectHandler对改动时间等数据进行自动导入
 * 有 activeRecord 和 mapper 两种数据库写入方法
 */
@SpringBootApplication
public class OrmMybatisPlusApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrmMybatisPlusApplication.class, args);
    }
}
