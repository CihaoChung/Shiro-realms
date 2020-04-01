package xyz.wadewhy.Vo;

import xyz.wadewhy.realm.VirtualType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @PACKAGE_NAME: xyz.wadewhy.Vo
 * @NAME: ActiviUser
 * @Author: 钟子豪
 * @DATE: 2020/4/1
 * @MONTH_NAME_FULL: 四月
 * @DAY: 01
 * @DAY_NAME_FULL: 星期三
 * @PROJECT_NAME: shirotest-master
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActiviUser {
    private String username;
    private String password;
    private VirtualType virtualType;
}
