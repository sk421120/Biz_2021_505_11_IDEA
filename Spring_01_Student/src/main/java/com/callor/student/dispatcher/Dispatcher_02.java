package com.callor.student.dispatcher;

import com.callor.student.controller.StController2;
import com.callor.student.service.StService;
import com.callor.student.service.impl.StService1;

public class Dispatcher_02 {

    public static void main(String[] args) {
        StController2 stCon = new StController2();
        StService stService = new StService1();
        stCon.setStService(stService);
        stCon.list();
    }
}
