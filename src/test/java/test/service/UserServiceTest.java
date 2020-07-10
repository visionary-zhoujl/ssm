package test.service;

import cn.ssm.pojo.User;
import cn.ssm.service.IUserService;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import test.BaseTest;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class UserServiceTest extends BaseTest {
    @Resource(name = "SimpleUserService")
    private IUserService userService;

    @Test
    public void testAdd(){
        User user;
        int[] result = new int[20];
        for (int i = 0;i<20;i++){
            user = new User();
            user.setLoginName("q123456"+i);
            user.setLoginPassword("123456");
            user.setCreateTime(new Date());
            user.setMobile("123321");
            user.setUserName("测试user"+i);
            user.setEmail("123@XXX.com");
            int x = userService.addUser(user);
            result[i] = x;
        }
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void testQueryAll(){
        PageInfo<User> pageInfo = userService.queryAll(2, 10);
        List<User> list = pageInfo.getList();
        for (User temp:list){
            System.out.println(temp.getUserName());
        }
    }

    @Test
    public void testUpdateById(){
        User user = new User();
        user.setUserId(1281485032959119360L);
        user.setUserName("测试修改");
        user.setEmail("csxg@XXX.com");
        user.setMobile("456654");
        userService.updateById(user);
    }

    @Test
    public void testDeleteById(){
        long userId = 1281485032959119360L;
        int i = userService.deleteUserById(userId);
        System.out.println(i);
    }

    @Test
    public void queryByUserName(){
        PageInfo<User> pageInfo = userService.queryUserListByUserName("1", 1, 10);
        List<User> list = pageInfo.getList();
        System.out.println(pageInfo.getTotal());
        for (User temp : list){
            System.out.println(temp.getUserName());
        }
    }
}
