package xyz.wadewhy.controller;

import xyz.wadewhy.realm.UserToken;
import xyz.wadewhy.realm.VirtualType;
import xyz.wadewhy.service.ShiroService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * @ClassName ShiroHandler
 * @Author 钟子豪
 * @Date 2019/2/28
 **/
@Controller
@RequestMapping("/shiro")
public class ShiroController {

    @Autowired
    private ShiroService shiroService;

    @RequestMapping("/testShiroAnnotation")
    public String testShiroAnnotation(HttpSession session){
        session.setAttribute("key","value123");
        shiroService.testMethod();
        return "redirect:/list.jsp";
    }

    @RequestMapping("/login")
    public String login(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            @RequestParam("realmType") String realmType
    ){
        Subject currentUser = SecurityUtils.getSubject();
        if (!currentUser.isAuthenticated()){
            //把用户名和密码封装为UsernamepasswordToken 对象
            UserToken token = null;
            if (realmType.equals("admin")){
              token= new UserToken(username,password,VirtualType.ADMINREALM);
            }else if (realmType.equals("user")){
                token = new UserToken(username, password,VirtualType.USERREALM );
            }
            //remember me
            token.setRememberMe(true);
            try{
                //执行登陆
                currentUser.login(token);
            }catch (AuthenticationException ae){
                System.out.println("登陆失败:"+ae.getMessage());
            }


        }

        return "redirect:../list.jsp";
    }
}
