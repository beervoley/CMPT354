/**
 * Created by vsevolod on 2018-05-17.
 */

package API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.*;


@SpringBootApplication
public class Application {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection connection = DriverManager.getConnection("jdbc:sqlserver://cypress.csil.sfu.ca;" +
                "user=s_viliushi;" +
                "password=7Lta2646mdrAGhrP");
//        System.out.println(connection.getCatalog());
//        Statement stl = null;
//        String queryToCreate = "CREATE TABLE Student" +
//                "(sid INTEGER," +
//                "name CHAR(20)," +
//                "address CHAR(30)," +
//                "phone CHAR(13)," +
//                "major CHAR(4))";
//        String queryToDelete = "DROP TABLE Student";
//        stl = connection.createStatement();
//        stl.executeQuery(query);
        connection.close();
        SpringApplication.run(Application.class, args);
    }

}
