package API.WebUtils;

import API.DBCommunication.DBCommun;

/**
 * Created by vsevolod on 2018-07-26.
 */
public class RequestHandler {

    public static String handleSearchAlbumsMapping(String name, String order) {
        String[] arr = name.split(" ");
        switch (arr.length) {
            case 1:
                if (order.equals("ASC")) return DBCommun.getAlbumByOneSearchStringASC(arr[0]);
                else return DBCommun.getAlbumByOneSearchStringDESC(arr[0]);

            case 2:
                if (order.equals("ASC")) return DBCommun.getAlbumByTwoSearchStringASC(arr[0], arr[1]);
                else return DBCommun.getAlbumByTwoSearchStringDESC(arr[0], arr[1]);

            default:
                break;
        }
        return "";
    }
    public static String handleSearchAlbumsMapping(int id) {
        return DBCommun.getAlbumByID(id);
    }
    public static String handleSearchAlbumsMapping() {return DBCommun.getAllAlbums();}


    public static String handleSearchManagerMapping(String name) {
        String[] arr = name.split(" ");
        switch (arr.length) {
            case 1:
                return DBCommun.getManagerByFirstName(arr[0]);
            case 2:
                return DBCommun.getManagerByFullName(arr[0], arr[1]);
            default:
                break;
        }
        return "";
    }
    public static String handleSearchManagerMapping(int id) {
        return DBCommun.getManagerByID(id);
    }
    public static String handleSearchManagerMapping() { return DBCommun.getAllManagers(); }

    public static String handleSearchStoreTechnicianMapping(String name) {
        String[] arr = name.split(" ");
        switch (arr.length) {
            case 1:
                return DBCommun.getStoreTechnicianByFirstName(arr[0]);
            case 2:
                return DBCommun.getStoreTechnicianByFullNameQuery(arr[0], arr[1]);
            default:
                break;
        }
        return "";
    }
    public static String handleSearchStoreTechnicianMapping(int id) {
        return DBCommun.getStoreTechnicianByID(id);
    }
    public static String handleSearchStoreTechnicianMapping() { return DBCommun.getAllStoreTechnicians(); }

    public static String handleSearchCustomerMapping(String name) {
        String[] arr = name.split(" ");
        switch (arr.length) {
            case 1:
                return DBCommun.getCustomerByFirstName(arr[0]);
            case 2:
                return DBCommun.getCustomerByFullName(arr[0], arr[1]);
            default:
                break;
        }
        return "";
    }
    public static String handleSearchCustomerMapping(int id) {
        return DBCommun.getCustomerByID(id);
    }
    public static String handleSearchCustomerMapping() { return DBCommun.getAllCustomers(); }


    public static String handleSearchArtistMapping(String name) {
        String[] arr = name.split(" ");
        switch (arr.length) {
            case 1:
                return DBCommun.getArtistByFirstName(arr[0]);
            case 2:
                return DBCommun.getArtistByFullName(arr[0], arr[1]);
            default:
                break;
        }
        return "";
    }
    public static String handleSearchArtistMapping(int id) {
        return DBCommun.getArtistByID(id);
    }
    public static String handleSearchArtistMapping() { return DBCommun.getAllArtists(); }


}
