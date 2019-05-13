package top.byk.dao;

import org.springframework.stereotype.Repository;
import top.byk.entity.User;

import java.util.List;

/**
 * TODO:
 * author:ykb
 * DateTime:2019/5/13 14:50
 */
@Repository
public interface UserMapper {

    List<User> getAll();
}
