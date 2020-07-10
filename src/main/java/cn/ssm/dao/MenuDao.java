package cn.ssm.dao;

import cn.ssm.pojo.Menu;

import java.util.List;

/**
 * @author zhoujl
 */
public interface MenuDao {

    /**
     * 获取所有顶层菜单
     * @return 顶层菜单列表
     */
    List<Menu> queryAllTopMenu();

    /**
     * 添加一个菜单
     * @param menu 新增的菜单信息
     * @return 新增结果
     */
    int addMenu(Menu menu);

    /**
     * 修改菜单信息
     * @param menu 修改的菜单信息
     * @return 修改结果
     */
    int updateMenuById(Menu menu);

    /**
     * 根据菜单ID删除数据
     * @param menuId 需要删除的菜单ID
     * @return 删除结果
     */
    int deleteMenuById(Long menuId);

    /**
     * 根据父菜单ID获取子菜单列表
     * @param parentMenuId
     * @return 子菜单列表
     */
    List<Menu> queryChileMenu(Long parentMenuId);
}
