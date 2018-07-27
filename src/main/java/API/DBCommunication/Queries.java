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
    public static String getManagerByFirstNameQuery(String name) {
        return String.format("SELECT * " +
                "FROM Manager " +
                "WHERE EmployeeName LIKE '%%%s%%';", name);
    }
    public static String getManagerByFullNameQuery(String firstName, String lastName) {
        return String.format("SELECT * " +
                "FROM Manager " +
                "WHERE EmployeeName LIKE '%%%s%%' OR EmployeeName LIKE '%%%s%%';", firstName, lastName);
    }
    public static String getManagerByIDQuery(int id) {
        return String.format("SELECT * FROM Manager WHERE EmployeeID = %d;", id);
    }
    public static String deleteManagerByIDQuery(int id) {
        return String.format("DELETE FROM Manager " +
                "WHERE EmployeeID = %d;" ,id);
    }


    // Queries for StoreTechnician Table
    public static String getAllStoreTechniciansQuery() {
        return "SELECT * " +
                "FROM StoreTechnician;";
    }
    public static String getStoreTechnicianByFirstNameQuery(String name) {
        return String.format("SELECT * " +
                "FROM StoreTechnician " +
                "WHERE EmployeeName LIKE '%%%s%%';", name);
    }
    public static String getStoreTechnicianByFullNameQuery(String firstName, String lastName) {
        return String.format("SELECT * " +
                "FROM StoreTechnician " +
                "WHERE EmployeeName LIKE '%%%s%%' OR EmployeeName LIKE '%%%s%%';", firstName, lastName);
    }
    public static String getStoreTechnicianByIDQuery(int id) {
        return String.format("SELECT * FROM StoreTechnician WHERE EmployeeID = %d;", id);
    }
    public static String deleteStoreTechnicianByIDQuery(int id) {
        return String.format("DELETE FROM StoreTechnician " +
                "WHERE EmployeeID = %d;" ,id);
    }


    // Queries for Customer Table
    public static String getAllCustomersQuery() {
        return "SELECT * " +
                "FROM Customer;";
    }
    public static String getCustomerByFirstNameQuery(String name) {
        return String.format("SELECT * " +
                "FROM Customer " +
                "WHERE CustomerName LIKE '%%%s%%", name);
    }
    public static String getCustomerByFullNameQuery(String firstName, String lastName) {
        return String.format("SELECT * " +
                "FROM Customer " +
                "WHERE CustomerName LIKE '%%%s%%' OR CustomerName LIKE '%%%s%%';", firstName, lastName);
    }
    public static String getCustomerByIDQuery(int id) {
        return String.format("SELECT * " +
                "FROM Customer " +
                "WHERE CustomerID = %d;", id);
    }
    public static String deleteCustomerByIDQuery(int id) {
        return String.format("DELETE FROM Customer " +
                "WHERE CustomerID = %d;" ,id);
    }


    // Queries for Album Table
    public static String getAllAlbumsQuery() {
        return "SELECT AlbumName, AlbumYear, Price, ArtistName " +
                "FROM Artist, Album " +
                "WHERE Artist.ArtistID = Album.ArtistID";
    }
    public static String getAlbumByNameQuery(String name) {
        return String.format("SELECT ArtistID, AlbumName, AlbumYear, Price, ArtistName " +
                "FROM Album, Artist " +
                "WHERE Album.AlbumName LIKE '%%%s%%' " +
                "AND Album.ArtistID = Artist.ArtistID;", name);
    }
    public static String getAlbumByArtistFirstNameASCPriceQuery(String name) {
        return String.format("SELECT AlbumID, AlbumName, AlbumYear, Price, ArtistName " +
                "FROM Album, Artist a1 " +
                "WHERE Album.ArtistID IN " +
                "(SELECT Artist.ArtistID FROM " +
                "Artist WHERE a1.ArtistName = Artist.ArtistName AND Artist.ArtistName LIKE '%%%s%%');", name);
    }
    public static String getAlbumByArtistFirstNameDESCPriceQuery(String name) {
        return String.format("SELECT AlbumID, AlbumName, AlbumYear, Price, ArtistName " +
                "FROM Album, Artist a1 " +
                "WHERE Album.ArtistID IN " +
                "(SELECT Artist.ArtistID FROM " +
                "Artist WHERE a1.ArtistName = Artist.ArtistName AND Artist.ArtistName LIKE '%%%s%%') " +
                "ORDER BY Price DESC;", name);
    }
    public static String getAlbumByArtistFullNameDESCPriceQuery(String firstName, String lastName) {
        return String.format("SELECT AlbumID, AlbumName, AlbumYear, Price, ArtistName " +
                "FROM Album, Artist a1 " +
                "WHERE Album.ArtistID IN " +
                "(SELECT Artist.ArtistID FROM " +
                "Artist WHERE a1.ArtistName = Artist.ArtistName AND " +
                "(Artist.ArtistName LIKE '%%%s%%' OR Artist.ArtistName LIKE '%%%s%%')) " +
                "ORDER BY Price DESC;", firstName, lastName);
    }
    public static String getAlbumByArtistFullNameASCPriceQuery(String firstName, String lastName) {
        return String.format("SELECT AlbumID, AlbumName, AlbumYear, Price, ArtistName " +
                "FROM Album, Artist a1 " +
                "WHERE Album.ArtistID IN " +
                "(SELECT Artist.ArtistID FROM " +
                "Artist WHERE a1.ArtistName = Artist.ArtistName AND " +
                "(Artist.ArtistName LIKE '%%%s%%' OR Artist.ArtistName LIKE '%%%s%%'));", firstName, lastName);
    }
    public static String deleteAlbumByIDQuery(int id) {
        return String.format("DELETE FROM Album " +
                "WHERE AlbumID = %d;" ,id);
    }




    // Queries for Artist Table
    public static String getAllArtistsQuery() {
        return "SELECT * " +
                "FROM ARTIST;";
    }
    public static String getArtistNamyByIDQuery(int artistID) {
        return String.format("SELECT ArtistName FROM Artist WHERE ArtistID = %d;", artistID);
    }
    public static String deleteArtistByIDQuery(int id) {
        return String.format("DELETE FROM Artist " +
                "WHERE ArtistID = %d;" ,id);
    }



}
