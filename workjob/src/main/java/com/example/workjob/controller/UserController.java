package com.example.workjob.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.workjob.pojo.User;
import com.example.workjob.pojo.XmlUser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @RequestMapping(value = "/getUser", method = RequestMethod.POST)
    public @ResponseBody
    JSONObject getUser() {
        JSONObject uu = new JSONObject();
        uu.put("name","测试");
        uu.put("id","111");
        return uu;
    }
    @RequestMapping(value = "/getXmlUser", method = RequestMethod.POST)
    public @ResponseBody
    XmlUser getXmlUser() {
        XmlUser uu = new XmlUser();
        uu.setUserName("222");
        uu.setUserId(222);
        return uu;
    }
}

