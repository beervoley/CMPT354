package API;

/**
 * Created by vsevolod on 2018-05-17.
 */

import API.DBCommunication.SQLDB;
import Model.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.Map;

@RestController
public class Controller {

    private SQLDB database = new SQLDB();

    @RequestMapping("/getCD")
    public String getCD(@RequestParam Map<String, String> params) {

        String toReturn = "";

        for(Map.Entry entry: params.entrySet()) {
            toReturn += (entry.getValue().toString()) + " ";
        }
        return toReturn;
    }

    @RequestMapping("/getAlbum")
    public Album getAlbum(@RequestParam int id) throws SQLException {
        return database.getAlbum(id);
    }





}
