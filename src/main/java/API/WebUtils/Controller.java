package API.WebUtils;

/**
 * Created by vsevolod on 2018-05-17.
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import static API.DBCommunication.DBCommun.*;

@RestController
public class Controller {

    @RequestMapping("/searchAlbums")
    public static String searchAlbums(@RequestParam("name") String name,
                                      @RequestParam(value = "order", defaultValue = "ASC") String order)
    {
        String JSONResponse = RequestHandler.handleSearchAlbumsMapping(name, order);
        return JSONResponse;
    }







}
