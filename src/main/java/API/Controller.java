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


    @RequestMapping("/getCD")
    public String getCD(@RequestParam Map<String, String> params) {

        String toReturn = "";

        for(Map.Entry entry: params.entrySet()) {
            toReturn += (entry.getValue().toString()) + " ";
        }
        return toReturn;
    }

}
