package test.dao;

import cn.ssm.dao.MenuDao;
import cn.ssm.pojo.Menu;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import test.BaseTest;

import java.util.Date;
import java.util.List;

public class MenuDaoTest extends BaseTest {

    @Autowired
    private MenuDao menuDao;

    private static Long TEST_ID=1181485030320902144L;
    private static Long CHILD_TEST_ID=1291485030320902144L;

    @Test
    public void testAddMenu(){
        Menu menu = new Menu();
        menu.setMenuId(CHILD_TEST_ID);
        menu.setMenuName("子菜单");
        menu.setParentMenuId(TEST_ID);
        menu.setIsLeafMenu(1);
        menu.setMenuPriority(1);
        menu.setMenuUrl("https://www.baidu.com");
        menu.setCreateTime(new Date());
        Assert.assertEquals(1, menuDao.addMenu(menu));
    }
    @Test
    public void testQueryTopMenu(){
        List<Menu> menus = menuDao.queryAllTopMenu();
        for (Menu temp:menus){
            System.out.println(temp.getMenuName());
        }
    }

    @Test
    public void testQueryChildMenu(){
        List<Menu> menus = menuDao.queryChildMenu(TEST_ID);
        for (Menu temp:menus){
            System.out.println(temp.getMenuName());
        }
    }

    @Test
    public void testUpdateMenuById(){
        Menu menu = menuDao.queryByMenuId(CHILD_TEST_ID);
        menu.setMenuName("更新子菜单");
        Assert.assertEquals(1,menuDao.updateMenuById(menu));
    }

    @Test
    public void testQueryMenuById(){
        Menu menu = menuDao.queryByMenuId(CHILD_TEST_ID);
        System.out.println(menu.getMenuName());
    }
    @Test
    public void testDeleteById(){
        Assert.assertEquals(1,menuDao.deleteMenuById(CHILD_TEST_ID));
    }
}
