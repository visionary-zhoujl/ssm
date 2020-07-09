package cn.ssm.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author le
 */
public class User implements Serializable {

    /**
     * 用户ID 唯一标识
     */
    private int userId;

    /**
     * 登录名
     */
    private int loginName;

    /**
     * 登录密码
     */
    private int loginPassword;

    /**
     * 用户昵称
     */
    private int userName;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 电子邮箱
     */
    private String email;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 上次登录时间
     */
    private Date lastLoginTime;

    /**
     * 登录次数
     */
    private int loginCount;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getLoginName() {
        return loginName;
    }

    public void setLoginName(int loginName) {
        this.loginName = loginName;
    }

    public int getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(int loginPassword) {
        this.loginPassword = loginPassword;
    }

    public int getUserName() {
        return userName;
    }

    public void setUserName(int userName) {
        this.userName = userName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public int getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(int loginCount) {
        this.loginCount = loginCount;
    }
}
