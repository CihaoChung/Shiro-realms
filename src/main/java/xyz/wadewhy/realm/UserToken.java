package xyz.wadewhy.realm;

import org.apache.shiro.authc.UsernamePasswordToken;

/**
 * @PACKAGE_NAME: xyz.wadewhy.realm
 * @NAME: UserToken
 * @Author: 钟子豪
 * @DATE: 2020/4/1
 * @MONTH_NAME_FULL: 四月
 * @DAY: 01
 * @DAY_NAME_FULL: 星期三
 * @PROJECT_NAME: shirotest-master
 **/
public class UserToken extends UsernamePasswordToken {
    //用来判断是学生登录，还是教师或管理员登录
    private VirtualType virtualType;

    public UserToken(final String username, final String password, VirtualType virtualType) {
        super(username, password);
        this.virtualType = virtualType;
    }

    public VirtualType getVirtualType() {
        return virtualType;
    }

    public void setVirtualType(VirtualType virtualType) {
        this.virtualType = virtualType;
    }
}
