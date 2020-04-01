package xyz.wadewhy.factory;

import java.util.LinkedHashMap;

/**
 * @ClassName filterChainDefinitionMapBuilder
 * @Author 钟子豪
 * @Date 2019/3/1
 **/
public class filterChainDefinitionMapBuilder {

    public LinkedHashMap<String,String> builFilterChainDefinitionMap(){
        LinkedHashMap<String,String> map = new LinkedHashMap<>();

        map.put("/login.jsp","anon");
        map.put("/shiro/login","anon");
        map.put("/shiro/logout","logout");
        map.put("/user.jsp","authc,roles[user]");
        map.put("/admin.jsp","authc,roles[admin]");
        map.put("/list.jsp","user");

        map.put("/**","authc");

        return map;
    }
}
