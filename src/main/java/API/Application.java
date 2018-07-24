/**
 * Created by vsevolod on 2018-05-17.
 */

package API;

import API.DBCommunication.DBCommun;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.*;
import java.util.Scanner;


@SpringBootApplication
public class Application {


    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        //TestDBConnection();
        System.out.println(DBCommun.getCDSByFirstName("Lil"));

        //SpringApplication.run(Application.class, args);


    }

    private static void TestDBConnection() {
        System.out.println("Enter your queries and hit enter to run them. Enter quit to stop testing.");
        while(true) {
            Scanner scanner = new Scanner(System.in);
            String nextLine = scanner.nextLine();
            if(nextLine.equals("quit")) {
                return;
            } else {
                DBCommun.runQuery(nextLine);
            }
        }
    }

}


