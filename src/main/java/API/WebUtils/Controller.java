package API.WebUtils;

/**
 * Created by vsevolod on 2018-05-17.
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/searchAlbums")
    public static String searchAlbums(@RequestParam(value = "name", defaultValue = "Default") String name,
                                      @RequestParam(value = "id", defaultValue = "-1") int id,
                                      @RequestParam(value = "order", defaultValue = "ASC") String order,
                                      @RequestParam(value = "count", defaultValue = "false") boolean count)
    {
        if(count) {
            return RequestHandler.handleSearchAlbumsMapping(count) + "";
        }
        else if(id != -1) {
            return RequestHandler.handleSearchAlbumsMapping(id);
        } else if(!name.equals("Default")) {
            return RequestHandler.handleSearchAlbumsMapping(name, order);
        } else {
            return RequestHandler.handleSearchAlbumsMapping();
        }

    }

    @RequestMapping("/deleteAlbum")
    public static String deleteAlbum(@RequestParam("id") int id) {
        return RequestHandler.handleDeleteAlbumMapping(id);
    }




    @RequestMapping("/searchArtists")
    public static String searchArtists(@RequestParam(value = "name", defaultValue = "Default") String name,
                                       @RequestParam(value = "id", defaultValue = "-1") int id)
    {
        if(id != -1) {
            return RequestHandler.handleSearchArtistMapping(id);
        } else if(!name.equals("Default")) {
            return RequestHandler.handleSearchArtistMapping(name);
        } else {
            return RequestHandler.handleSearchArtistMapping();
        }
    }

    @RequestMapping("/updateArtist")
    public static String updateArtist(@RequestParam(value = "id", defaultValue = "-1") int id,
                                      @RequestParam(value = "name", defaultValue = "Default") String name)
    {
        if(id != -1 && !name.equals("Default")) {
            return RequestHandler.handleUpdateArtistMapping(id, name);
        } else {
            return "Web Request Format is not correct.";
        }
    }

    @RequestMapping("/deleteArtist")
    public static String deleteArtist(@RequestParam("id") int id) {
        return RequestHandler.handleDeleteArtistMapping(id);
    }



    @RequestMapping("/searchManagers")
    public static String searchManagers(@RequestParam(value = "name", defaultValue = "Default") String name,
                                        @RequestParam(value = "id", defaultValue = "-1") int id)
    {
        if(id != -1) {
            return RequestHandler.handleSearchManagerMapping(id);
        } else if(!name.equals("Default")) {
            return RequestHandler.handleSearchManagerMapping(name);
        } else {
            return RequestHandler.handleSearchManagerMapping();
        }
    }

    @RequestMapping("/deleteManager")
    public static String deleteManager(@RequestParam("id") int id) {
        return RequestHandler.handleDeleteManagerMapping(id);
    }



    @RequestMapping("/searchStoreTechnicians")
    public static String searchStoreTechnicians(@RequestParam(value = "name", defaultValue = "Default") String name,
                                        @RequestParam(value = "id", defaultValue = "-1") int id)
    {
        if(id != -1) {
            return RequestHandler.handleSearchStoreTechnicianMapping(id);
        } else if(!name.equals("Default")) {
            return RequestHandler.handleSearchStoreTechnicianMapping(name);
        } else {
            return RequestHandler.handleSearchStoreTechnicianMapping();
        }
    }

    @RequestMapping("/deleteStoreTechnician")
    public static String deleteStoreTechnician(@RequestParam("id") int id) {
        return RequestHandler.handleDeleteStoreTechnicianMapping(id);
    }

    @RequestMapping("/searchCustomers")
    public static String searchCustomers(@RequestParam(value = "name", defaultValue = "Default") String name,
                                         @RequestParam(value = "id", defaultValue = "-1") int id,
                                         @RequestParam(value = "count", defaultValue = "false") boolean count,
                                         @RequestParam(value = "items", defaultValue = "notall") String items)
    {
        if(items.equals("all")) {
            return RequestHandler.handleSearchCustomerAllItemsMapping();
        }
        else if(count) {
            return RequestHandler.handleSearchCustomerMapping(count);
        }
        else if(id != -1) {
            return RequestHandler.handleSearchCustomerMapping(id);
        } else if(!name.equals("Default")) {
            return RequestHandler.handleSearchCustomerMapping(name);
        } else {
            return RequestHandler.handleSearchCustomerMapping();
        }
    }



    @RequestMapping("/deleteCustomer")
    public static String deleteCustomer(@RequestParam("id") int id) {
        return RequestHandler.handleDeleteCustomerMapping(id);
    }


    @RequestMapping("/searchReceipts")
    public static String searchReceipts(@RequestParam(value = "albumName", defaultValue = "Default") String albumName,
                                        @RequestParam(value = "albumID", defaultValue = "-1") int albumID,
                                        @RequestParam(value = "customerName", defaultValue = "Default") String customerName,
                                        @RequestParam(value = "customerID", defaultValue = "-1") int customerID,
                                        @RequestParam(value = "receiptID", defaultValue = "-1") int receiptID)
    {
        if(receiptID != -1) {
            return RequestHandler.handleSearchReceiptMapping(receiptID);
        }
        else if(albumID != -1) {
            return RequestHandler.handleSearchReceiptByAlbumMapping(albumID);
        } else if(customerID != -1) {
            return RequestHandler.handleSearchReceiptByCustomerMapping(customerID);
        } else if(!albumName.equals("Default")){
            return RequestHandler.handleSearchReceiptByAlbumMapping(albumName);
        } else if(!customerName.equals("Default")) {
            return RequestHandler.handleSearchReceiptByCustomerMapping(customerName);
        } else {
            return RequestHandler.handleSearchReceiptMapping();
        }
    }

    @RequestMapping("/deleteReceipt")
    public static String deleteReceipt(@RequestParam("id") int id) {
        return RequestHandler.handleDeleteReceiptMapping(id);
    }





}
