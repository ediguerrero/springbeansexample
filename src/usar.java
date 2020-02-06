import facade.implementation.Facade;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class usar {


    public static void main(String[]args){ ApplicationContext context = new ClassPathXmlApplicationContext("spring1.xml");

    Facade obj = (Facade) context.getBean("cosa2");

    obj.getBcart().metY(); }


}
