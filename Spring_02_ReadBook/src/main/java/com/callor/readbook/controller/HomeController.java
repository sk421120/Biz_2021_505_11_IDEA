package com.callor.readbook.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    Logger logger = LoggerFactory.getLogger(HomeController.class);

//    @Value("${db.username}")
//    private String userName;
//    @Value("${db.password}")
//    private String password;
//    @Value("${db.driverClassName}")
//    private String className;
//    @Value("${db.url}")
//    private String url;

    @ResponseBody
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        logger.debug("HOME이다!!!!");
        return "HOME";
//        return String.format("username : %s\n pw : %s\n" +
//                "url : %s\ndriver : %s", userName, password, className, url);
    }

    @RequestMapping(value = "/read", method = RequestMethod.GET)
    public String read() {
        return "read/insert";
    }

    @RequestMapping(value = "/book", method = RequestMethod.GET)
    public String book() {
        return "book/list";
    }


}
