package orm.mybatis.MapperAndPage.mappers;

import org.springframework.stereotype.Repository;
import orm.mybatis.MapperAndPage.entity.User;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author Late-en
 */
@Repository
public interface UserMapper extends Mapper<User>, MySqlMapper<User> {
}
