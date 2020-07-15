package test.dao;

import cn.ssm.dao.UserDao;
import cn.ssm.pojo.User;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import test.BaseTest;

import java.util.Date;
import java.util.List;

public class UserDaoTest extends BaseTest {
    @Autowired
    private UserDao userDao;

    private static Long TEST_ID=1181485030320902144L;
    @Test
    public void testAddUser(){
        User user = new User();
        user.setUserId(TEST_ID);
        user.setUserName("测试添加");
        user.setLoginName("loginName");
        user.setLoginPassword("loginPassword");
        user.setMobile("123456987111");
        user.setEmail("123@qq.com");
        user.setCreateTime(new Date());

        int i = userDao.addUser(user);
        Assert.assertEquals(1,i);
    }

    @Test
    public void testQueryUserById(){
        User user = userDao.queryUserById(TEST_ID);
        System.out.println(user.getUserName());
    }


    @Test
    public void testQueryAll(){
        List<User> list = userDao.queryAll();
        for (User temp:list){
            System.out.println(temp.getUserName());
        }
    }

    @Test
    public void testQueryUserListByUserName(){
        List<User> list = userDao.queryUserListByUserName("试添");
        for (User temp:list){
            System.out.println(temp.getUserName());
        }
    }

    @Test
    public void testUpdateById(){
        User user = userDao.queryUserById(TEST_ID);
        user.setUserName("测试修改");
        Assert.assertEquals(1, userDao.updateById(user));

    }

    @Test
    public void testDeleteUserById(){
        Assert.assertEquals(1,userDao.deleteUserById(TEST_ID));
    }
}
