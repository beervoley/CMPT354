package API.DBCommunication;

/**
 * Created by vsevolod on 2018-07-24.
 */


public class Queries {


    // Queries for Manager Table
    public static String getAllManagersQuery() {
        return "SELECT * " +
                "FROM Manager;";
    }
    public static String getManagerByNameQuery(String name) {
        return String.format("SELECT * " +
                "FROM Manager " +
                "WHERE EmployeeName LIKE '%%%s%%';", name);
    }
    public static String getManagerByIDQuery(int id) {
        return String.format("SELECT * FROM Manager WHERE EmployeeID = %d;", id);
    }
    // TODO: Google delete query for SQL Server
    public static String deleteManagerByIDQuery(int id) {
//        return String.format("DELETE " ,id)
        return "";
    }


    // Queries for StoreTechnician Table
    public static String getAllStoreTechniciansQuery() {
        return "SELECT * " +
                "FROM StoreTechnician;";
    }
    public static String getStoreTechnicianByNameQuery(String name) {
        return String.format("SELECT * " +
                "FROM StoreTechnician " +
                "WHERE EmployeeName LIKE '%%%s%%';", name);
    }
    public static String getStoreTechnicianByIDQuery(int id) {
        return String.format("SELECT * FROM StoreTechnician WHERE EmployeeID = %d;", id);
    }
    public static String deleteStoreTechnicianByIDQuery(int id) {
        return "";
    }


    // Queries for Customer Table
    public static String getAllCustomersQuery() {
        return "SELECT * " +
                "FROM Customer;";
    }
    public static String getCustomerByNameQuery(String name) {
        return String.format("SELECT * " +
                "FROM Customer " +
                "WHERE CustomerName LIKE '%%%s%%", name);
    }
    public static String getCustomerByIDQuery(int id) {
        return String.format("SELECT * " +
                "FROM Customer " +
                "WHERE CustomerID = %d;", id);
    }
    public static String deleteCustomerByIDQuery(int id) {
        return "";
    }


    // Queries for Album Table
    public static String getAllAlbumsQuery() {
        return "SELECT AlbumName, AlbumYear, Price, ArtistName " +
                "FROM Artist, Album " +
                "WHERE Artist.ArtistID = Album.ArtistID";
    }
    public static String getAlbumByArtistNameQuery(String name) {
        return String.format("SELECT ArtistID, AlbumName, AlbumYear, Price, ArtistName " +
                "FROM Album, Artist a1 " +
                "WHERE Album.ArtistID IN " +
                "(SELECT Artist.ArtistID FROM " +
                "Artist WHERE a1.ArtistName = Artist.ArtistName AND Artist.ArtistName LIKE '%%%s%%';", name);
    }
    public static String getAlbumByNameQuery(String name) {
        return String.format("SELECT ArtistID, AlbumName, AlbumYear, Price, ArtistName " +
                "FROM Album, Artist " +
                "WHERE Album.AlbumName LIKE '%%%s%%' " +
                "AND Album.ArtistID = Artist.ArtistID;", name);
    }
    public static String getAlbumByArtistNameDESCPriceQuery(String name) {
        return String.format("SELECT ArtistID, AlbumName, AlbumYear, Price " +
                "FROM Album " +
                "WHERE ArtistID IN (SELECT ArtistID FROM Artist WHERE ArtistName LIKE '%%%s%%')" +
                "ORDER BY Price DESC;", name);
    }


    // Queries for Artist Table
    public static String getAllArtistsQuery() {
        return "SELECT * " +
                "FROM ARTIST;";
    }
    public static String getArtistNamyByIDQuery(int artistID) {
        return String.format("SELECT ArtistName FROM Artist WHERE ArtistID = %d;", artistID);
    }


}
