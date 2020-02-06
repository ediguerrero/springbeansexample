package controller;

import facade.IFacade;
import facade.impl.DefaultIFacade;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Controller {


    public static void main(String[]args){ ApplicationContext context = new ClassPathXmlApplicationContext("spring1.xml");

    IFacade obj = (DefaultIFacade) context.getBean("cosa2");

    System.out.println(obj.mycart());

    }


}
