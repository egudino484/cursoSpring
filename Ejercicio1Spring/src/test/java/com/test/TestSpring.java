package com.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.spring.BeanSpring;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author admin
 */
public class TestSpring {
    
    public TestSpring() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testSpringFramework() {
         ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/com/configuracion/AplicationContext.xml");
         BeanFactory factory = context;
         BeanSpring miBean= (BeanSpring)factory.getBean("beanSpring");
         System.out.println("mensaje: "+ miBean.getMensaje());
     }
                 
}
