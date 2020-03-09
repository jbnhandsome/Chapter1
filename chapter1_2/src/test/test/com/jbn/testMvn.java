package com.jbn;

import com.jbn.dao.TestDao;
import com.jbn.dao.TestDaoImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testMvn {

    @Test
    public void m1() {

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestDao testDao = (TestDaoImpl) classPathXmlApplicationContext.getBean("testDao");
        testDao.sayHello();
    }

}
