/**
 * Created by vsevolod on 2018-05-17.
 */

package API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


//@SpringBootApplication
public class Application {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection connection = DriverManager.getConnection("jdbc:sqlserver://cypress.csil.sfu.ca;" +
                "user=s_viliushi;" +
                "password=7Lta2646mdrAGhrP");
        System.out.println(connection.getCatalog());

      //  SpringApplication.run(Application.class, args);
    }

}
