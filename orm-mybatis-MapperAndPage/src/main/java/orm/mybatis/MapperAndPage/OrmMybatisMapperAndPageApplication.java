package orm.mybatis.MapperAndPage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author Late-en
 * 这个demo是通用mapper和pageHelper插件的使用
 * 通用mapper是一个实现了基本crud功能的接口，让自己书写的mapper继承后就拥有了基本方法
 * pageHelper用于对数据库返回的数据做分页处理
 */

@SpringBootApplication
@MapperScan(basePackages = {"orm.mybatis.MapperAndPage.mappers"})
public class OrmMybatisMapperAndPageApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrmMybatisMapperAndPageApplication.class, args);
    }
}
