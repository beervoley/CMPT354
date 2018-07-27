package API;

/**
 * Created by vsevolod on 2018-05-17.
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import static API.DBCommunication.DBCommun.*;
import static API.DBCommunication.SQLDB.*;

@RestController
public class Controller {

    @RequestMapping("/searchAlbums")
    public static String searchAlbums(@RequestParam("name") String name) {

        return getCDSByFirstName(name);

    }







}
