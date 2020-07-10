package cn.ssm.service;

import cn.ssm.pojo.User;
import com.github.pagehelper.PageInfo;


/**
 * 用户服务接口
 * @author zhoujl
 */
public interface IUserService {

    /**
     * 查询所有用户信息
     * @param startIndex  起始位置
     * @param count       查询记录条数
     * @return  分页查询结果
     */
    PageInfo<User> queryAll(int startIndex, int count);

    /**
     * 添加用户
     * @param user 添加的用户信息
     * @return int
     */
    int addUser(User user);

    /**
     * 根据用户ID删除用户
     * @param userId 需要删除的用户ID
     * @return int
     */
    int deleteUserById(long userId);

    /**
     * 更新用户信息
     * @param user 需要更新的用户信息
     */
    void updateById(User user);

    /**
     * 根据用户名进行模糊查询
     * @param userName 查询的用户名
     * @param pageNum 页数
     * @param pageSize 数据条数
     * @return 返回分页信息
     */
    PageInfo<User> queryUserListByUserName(String userName,int pageNum,int pageSize);
}
