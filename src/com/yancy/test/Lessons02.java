package com.yancy.test;

import com.yancy.service.IUserService;
import com.yancy.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lessons02 {

    @Test
    public void test1() {
        //以前的方式 自己创建对象
       /* IUserService userService = new UserServiceImpl();
        userService.add();*/

        //现在的方式 从spring容器获取
        //1. 加载beans配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //2. 从spring容器获取对象
        IUserService userService1 = (IUserService) context.getBean("userService");
        IUserService userService2 = (IUserService) context.getBean("userService");
        userService1.add();
        System.out.println(userService1);
        System.out.println(userService2);
    }
}
