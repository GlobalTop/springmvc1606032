package com.cym.demo.controller;

import com.cym.demo.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/6/3.
 */
@Controller
//@RequestMapping("/index")
public class IndexController {
    private UserServiceI userService;

    public UserServiceI getUserService()
    {
        return userService;
    }

    @Autowired
    public void setUserService(UserServiceI userService)
    {
        this.userService = userService;
    }
    /**
     * ajax 请求（springMVC会自动转成json无需再使用JSON.toJSONString转换）
     *
     * @param
     * @return List<Map<String,Object>> to json串
     *
     */
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public
    String getIndex(HttpServletRequest request, HttpServletResponse response)
    {
        return "/index";
    }


}
