package API;

/**
 * Created by vsevolod on 2018-05-17.
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class Controller {
    private static String SEARCH_TYPE_KEY = "srch";
    private enum SEARCH_TYPES {
        BYARTISTNAME,
        BYARTISTLASTNAME,
        BYARTISTFULLNAME,
        BYALBUMNAME
    }


    @RequestMapping("/getCD")
    public String getCD(@RequestParam Map<String, String> params) {

        switch (SEARCH_TYPES.valueOf(params.get(SEARCH_TYPE_KEY))) {
            case BYARTISTNAME:
                break;
            case BYARTISTLASTNAME:
                break;
            case BYARTISTFULLNAME:
                break;
            case BYALBUMNAME:
                break;
            default:
                break;

        }

        return "";
    }


}
