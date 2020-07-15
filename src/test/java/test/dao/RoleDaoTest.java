package test.dao;

import cn.ssm.dao.RoleDao;
import cn.ssm.pojo.Role;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import test.BaseTest;

import java.util.Date;
import java.util.List;

public class RoleDaoTest extends BaseTest {
    @Autowired
    private RoleDao roleDao;

    private static Long TEST_ID=1181485030320902144L;

    @Test
    public void testAddRole(){
        Role role = new Role();
        role.setRoleId(TEST_ID);
        role.setRoleName("测试角色");
        role.setCreateTime(new Date());
        Assert.assertEquals(1,roleDao.addRole(role));
    }

    @Test
    public void testQueryAllRole(){
        List<Role> roles = roleDao.queryAllRole();
        for (Role temp:roles){
            System.out.println(temp.getRoleName());
        }
    }
    @Test
    public void testQueryRoleById(){
        Role role = roleDao.queryRoleById(TEST_ID);
        System.out.println(role.getRoleName());
    }

    @Test
    public void testUpdateByRoleId(){
        Role role = roleDao.queryRoleById(TEST_ID);
        role.setRoleName("角色修改");
        Assert.assertEquals(1,roleDao.updateByRoleId(role));
    }

    @Test
    public void testDeleteRoleById(){
        Assert.assertEquals(1,roleDao.deleteRoleById(TEST_ID));
    }
}
