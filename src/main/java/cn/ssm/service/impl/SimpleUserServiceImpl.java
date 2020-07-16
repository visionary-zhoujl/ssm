package cn.ssm.service.impl;

import cn.ssm.dao.UserDao;
import cn.ssm.pojo.User;
import cn.ssm.service.IUserService;
import cn.ssm.util.GenerateParamKey;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhoujl
 * 简单用户服务实现类
 */
@Service("SimpleUserService")
public class SimpleUserServiceImpl implements IUserService {
    @Autowired
    private UserDao userDao;
    @Override
    public PageInfo<User> queryAll(int startIndex, int count) {
        PageHelper.startPage(startIndex,count);
        List<User> list =  userDao.queryAll();
        return new PageInfo<>(list);
    }

    @Override
    public int addUser(User user) {
        long userId = GenerateParamKey.snowflakeGenerate();
        user.setUserId(userId);
        return userDao.addUser(user);
    }

    @Override
    public int deleteUserById(long userId) {
        return userDao.deleteUserById(userId);
    }

    @Override
    public void updateById(User user) {
        userDao.updateById(user);
    }

    @Override
    public PageInfo<User> queryUserListByUserName(String userName,int pageNum,int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<User> list = userDao.queryUserListByUserName(userName);
        return new PageInfo<>(list);
    }
}
