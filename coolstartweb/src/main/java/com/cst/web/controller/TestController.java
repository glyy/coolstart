package com.cst.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @RequestMapping(value="/test/userinfo/{userId}")
    @ResponseBody
    public String getUserInfo(@PathVariable(value="userId") String userId){
        logger.info("userId :{}",userId);
        return "{\"2\":\"3\"}";
    }
    
    public String addUser() {
    	System.out.println("测试方法");
    	return "";
    }
}
