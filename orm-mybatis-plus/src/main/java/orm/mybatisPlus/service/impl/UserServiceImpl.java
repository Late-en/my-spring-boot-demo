package orm.mybatisPlus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import orm.mybatisPlus.entity.User;
import orm.mybatisPlus.mappers.UserMapper;
import orm.mybatisPlus.service.UserService;

/**
 * @author Late-en
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
