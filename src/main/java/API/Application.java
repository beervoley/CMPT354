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

        SpringApplication.run(Application.class, args);
    }

}
