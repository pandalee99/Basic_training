package cn.ustcsse.basic.controller;

import cn.ustcsse.basic.domain.Login;
import cn.ustcsse.basic.domain.Manager;
import cn.ustcsse.basic.domain.Teacher;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController extends BaseController{

    @RequestMapping("/user/login")
    public Login  login(@Validated @RequestBody Login login){
        Login l = new Login();
       l.setUsername("admin");
       l.setPassword("123");
        return l;
    }
}
