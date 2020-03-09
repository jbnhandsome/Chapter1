package com.jbn.Test;

import com.jbn.dao.TestDao;
import com.jbn.dao.TestDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestDao testDao = (TestDaoImpl) applicationContext.getBean("testDao");
        testDao.sayHello();
    }
}
