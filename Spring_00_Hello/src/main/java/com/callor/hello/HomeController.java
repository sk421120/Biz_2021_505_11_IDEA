package com.callor.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    
    @ResponseBody
    @RequestMapping(value =  "/", method = RequestMethod.GET)
    public String home() {
        return "hello, 하하";
    }
}
