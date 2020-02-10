import java.sql.DriverManager;
import java.sql.Connection;

public class Dao {

public void conectar(){

    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/Tienda","root","tomate1");
    } catch (Exception e) {
        e.printStackTrace();
    }


}

}
