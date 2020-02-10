package controller;

import facade.IFacade;
import facade.impl.DefaultIFacade;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Controller {


    public static void main(String[]args){



            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Tienda","root","tomate1");
                Statement st= con.createStatement();
                ResultSet rs= st.executeQuery("SELECT * FROM Usuario");
           //  System.out.println("id"+rs.getInt("total"));
               //System.out.println(""+ rs.first());

             //  rs.afterLast();
                while(rs.next()) {
                 //   System.out.println("" + rs.next());
                    System.out.println("nombre  " + rs.getString("name") + " id " + rs.getInt("idUsuario") + "");
                }
               rs.close();
            } catch (Exception e) {
                e.printStackTrace();
            }





        ApplicationContext context = new ClassPathXmlApplicationContext("spring1.xml");

    IFacade obj = (DefaultIFacade) context.getBean("cosa2");

    System.out.println(obj.mycart());

    }


}
