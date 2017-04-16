package com.toolkit.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <p>用户管理类：注册，登录，修改</p>
 *
 * @author xzx4959
 * @version 1.0
 * @date 创建时间 ：2017/4/16 9:34
 */
@Controller
public class UserManagerController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(){
        return "index";
    }
}
