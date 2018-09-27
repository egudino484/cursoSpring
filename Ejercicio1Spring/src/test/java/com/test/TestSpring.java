package com.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.spring.BeanSpring;
import com.spring.Persona;
import com.spring.listas.SLAcademia;
import com.spring.listas.SLCiudad;
import com.spring.objetos.Profesor;
import java.util.Iterator;
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
       //BeanSpring miBean= (BeanSpring)factory.getBean("beanSpring");
         BeanSpring miBean= (BeanSpring)context.getBean("beanSpring");
         
                 

         System.out.println("Mensaje: "+ miBean.getMensaje());
         ///bean con constructor 
         Persona miBeanPersona= (Persona)factory.getBean("Juan");
         System.out.println("Nombre bean: "+ miBeanPersona.getNombre()+ " fecha: "+ miBeanPersona.getFechaNaicmiento().toLocaleString());
         //ejemplo objetos anidadis
       /* Profesor profesor= (Profesor) factory.getBean("idProfesor");
         System.out.println("Profesor nombre: "+ profesor.getNombre());
         System.out.println("Profesor academia: "+ profesor.getAcademia().getNombre());
         System.out.println("Profesor ciudad: "+ profesor.getAcademia().getCiudad().getNombre());*/
          /// traer la ciudad con la lista de academias
          SLCiudad miBeanCiudadLista= (SLCiudad)factory.getBean("idListaCiudad");
          for (SLAcademia obj :miBeanCiudadLista.getListAcademia() ) {
             
                      System.out.println("Academia lista: "+ obj.getNombre());

         }
          

     }
                 
}
