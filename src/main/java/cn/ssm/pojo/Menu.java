package cn.ssm.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author le
 */
public class Menu implements Serializable {
    /**
     * 菜单ID 唯一标识
     */
    private Long menuId;

    /**
     * 菜单名称
     */
    private String menuName;

    /**
     * 父菜单ID 默认为-1
     */
    private Long parentMenuId;


    /**
     * 菜单URL
     */
    private String menuUrl;

    /**
     * 菜单优先级
     */
    private Integer menuPriority;

    /**
     * 是否是叶子菜单
     * 0 不是
     * 1 是
     * 只有叶子菜单才有url
     */
    private Integer isLeafMenu;

    /**
     * 创建时间
     */
    private Date createTime;

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public Long getParentMenuId() {
        return parentMenuId;
    }

    public void setParentMenuId(Long parentMenuId) {
        this.parentMenuId = parentMenuId;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public Integer getMenuPriority() {
        return menuPriority;
    }

    public void setMenuPriority(Integer menuPriority) {
        this.menuPriority = menuPriority;
    }

    public Integer getIsLeafMenu() {
        return isLeafMenu;
    }

    public void setIsLeafMenu(Integer isLeafMenu) {
        this.isLeafMenu = isLeafMenu;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
