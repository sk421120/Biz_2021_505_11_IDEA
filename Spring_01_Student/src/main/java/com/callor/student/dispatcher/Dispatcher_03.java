package com.callor.student.dispatcher;

import com.callor.student.controller.StController3;
import com.callor.student.service.StService;
import com.callor.student.service.impl.StService1;

public class Dispatcher_03 {

    public static void main(String[] args) {
        StService stService = new StService1();
        StController3 stCon = new StController3(stService);
        stCon.list();
    }
}
