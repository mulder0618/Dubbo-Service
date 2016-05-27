package com.mulder.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by mulder on 16/5/27.
 */
public class DubboService {

    public DubboService() {
        //ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"dubbo-service.xml"});
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"dubbo-service.xml"});
        context.start();
    }
}
