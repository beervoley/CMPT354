/**
 * Created by vsevolod on 2018-05-17.
 */

package API;

import API.DBCommunication.DBCommun;
import API.DBCommunication.Queries;
import API.Model.Album;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class Application {
        public static void main(String[] args) {

            SpringApplication.run(Application.class, args);
        }
}
