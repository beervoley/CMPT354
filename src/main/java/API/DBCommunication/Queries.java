package API.DBCommunication;

/**
 * Created by vsevolod on 2018-07-24.
 */


public class Queries {



    public static String getAllManagersQuery() {
        return "SELECT *" +
                "FROM Manager;";
    }

    public static String getManagerByNameQuery(String name) {
        return String.format("SELECT *" +
                "FROM Manager" +
                "WHERE EmployeeName LIKE '%%%s%%", name);
    }


    public static String getCustomersQuery() {
        return "SELECT *" +
                "FROM Customer;";
    }

    public static String getCustomerByNameQuery(String name) {
        return String.format("SELECT *" +
                "FROM Customer" +
                "WHERE CustomerName LIKE '%%%s%%", name);
    }

    public static String getAllAlbumsQuery() {
        return "SELECT AlbumName, AlbumYear, Price, ArtistName" +
                "FROM Artist, Album" +
                "WHERE Artist.ArtistID = Album.ArtistID";
    }

    public static String getAllArtistsQuery() {
        return "SELECT * FROM ARTIST;";
    }



    public static String getArtistNamyByIDQuery(int artistID) {
        return String.format("SELECT ArtistName FROM Artist WHERE ArtistID = %d;", artistID);
    }

    public static String getAlbumByArtistNameQuery(String name) {
        return String.format("SELECT ArtistID, AlbumName, AlbumYear, Price " +
                "FROM Album " +
                "WHERE ArtistID IN (SELECT ArtistID FROM Artist WHERE ArtistName LIKE '%%%s%%';", name);
    }

    public static String getAlbumByArtistNameASCPriceQuery(String name) {
        return String.format("SELECT ArtistID, AlbumName, AlbumYear, Price " +
                "FROM Album " +
                "WHERE ArtistID IN (SELECT ArtistID FROM Artist WHERE ArtistName LIKE '%%%s%%')" +
                "ORDER BY Price;", name);
    }

    public static String getAlbumByArtistNameDESCPriceQuery(String name) {
        return String.format("SELECT ArtistID, AlbumName, AlbumYear, Price " +
                "FROM Album " +
                "WHERE ArtistID IN (SELECT ArtistID FROM Artist WHERE ArtistName LIKE '%%%s%%')" +
                "ORDER BY Price DESC;", name);
    }
}
