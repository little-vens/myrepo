package com.zelda.test;

import com.zelda.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Link
 * @Company http://www.zelda.com
 */
public class ServiceTest {

    @Test
    public void testFindAll(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        AccountService as = ac.getBean("acService",AccountService.class);
        System.out.println(as.findAll());
    }
}
