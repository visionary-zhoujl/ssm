package cn.ssm.util;


import com.sun.istack.internal.NotNull;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author zhoujl
 */
public class CookieUtil {

    /**
     * 获取cookie值
     * @param request 请求
     * @param cookieName key值
     * @return cookie的value值
     */
    public static String getCookie(HttpServletRequest request, @NotNull String cookieName) {

        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals(cookieName)) {
                    return cookie.getValue();
                }
            }
        }

        return null;
    }

    /**
     * 添加cookie
     * @param response 响应
     * @param cookieName cookie的key
     * @param value cookie的value
     */
    public static void writeCookie(HttpServletResponse response,@NotNull String cookieName, String value) {
        Cookie cookie = new Cookie(cookieName, value);

        //设置cookie的有效路径
        cookie.setPath("/");

        //整数表示保存的秒数，保存到硬盘，负数表示保存到浏览器的内存，0表示删除相同名字的cookie。
        cookie.setMaxAge(-1);
        response.addCookie(cookie);
    }

    /**
     * 添加cookie
     * @param response 响应
     * @param cookieName cookie的key值
     * @param value  cookie的value值
     * @param timeout  过期时间 单位 s
     */
    public static void writeCookie(HttpServletResponse response,@NotNull String cookieName, String value, int timeout) {
        Cookie cookie = new Cookie(cookieName, value);
        cookie.setPath("/");
        //浏览器关闭时失效
        cookie.setMaxAge(timeout);
        response.addCookie(cookie);
    }

}
