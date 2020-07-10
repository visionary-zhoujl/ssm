package cn.ssm.dao;

import cn.ssm.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author zhoujl
 */
public interface UserDao {
    /**
     * 查询所有用户信息
     * @return 符合条件的用户列表
     */
    List<User> queryAll();

    /**
     * 根据userId修改用户信息
     * @param user   需要修改的用户信息
     */
    void updateById(User user);

    /**
     * 添加用户
     * @param user 添加的用户信息
     * @return int
     */
    int addUser(User user);

    /**
     * 条件查询 根据用户昵称做模糊查询
     * @param userName 用户昵称
     * @return 符合条件的用户列表
     */
    List<User> queryUserListByUserName(@Param("userName") String userName);

    /**
     * 根据用户ID删除用户
     * @param userId 需要删除的用户ID
     * @return int
     */
    int deleteUserById(long userId);
}
