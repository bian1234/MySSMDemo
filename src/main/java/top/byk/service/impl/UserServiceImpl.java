package top.byk.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.byk.dao.UserMapper;
import top.byk.entity.User;
import top.byk.service.UserService;

import java.util.List;

/**
 * TODO:
 * author:ykb
 * DateTime:2019/5/13 15:01
 */
@Service
public class UserServiceImpl  implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> getAll() {
        return userMapper.getAll();
    }
}
