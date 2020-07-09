package cn.ssm.pojo;

import java.io.Serializable;

/**
 * @author le
 */
public class Menu implements Serializable {
    /**
     * 菜单ID 唯一标识
     */
    private int menuId;

    /**
     * 菜单名称
     */
    private String menuName;

    /**
     * 父菜单ID 默认为-1
     */
    private int parentMenuId;

    /**
     * 菜单层级
     */
    private int menuHierarchy;

    /**
     * 菜单URL
     */
    private String menuUrl;

    /**
     * 菜单优先级
     */
    private int menuPriority;

    /**
     * 是否是叶子菜单
     * 0 不是
     * 1 是
     * 只有叶子菜单才有url
     */
    private int isLeafMunu;

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public int getParentMenuId() {
        return parentMenuId;
    }

    public void setParentMenuId(int parentMenuId) {
        this.parentMenuId = parentMenuId;
    }

    public int getMenuHierarchy() {
        return menuHierarchy;
    }

    public void setMenuHierarchy(int menuHierarchy) {
        this.menuHierarchy = menuHierarchy;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public int getMenuPriority() {
        return menuPriority;
    }

    public void setMenuPriority(int menuPriority) {
        this.menuPriority = menuPriority;
    }
}
