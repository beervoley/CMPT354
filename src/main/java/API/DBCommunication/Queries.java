package API.DBCommunication;

/**
 * Created by vsevolod on 2018-07-24.
 */


public class Queries {


    // Queries for Manager Table
    public static String getAllManagersQuery() {
        return "SELECT * " +
                "FROM Manager;";
    } // tested
    public static String getManagerByFirstNameQuery(String name) {
        return String.format("SELECT * " +
                "FROM Manager " +
                "WHERE EmployeeName LIKE '%%%s%%';", name);
    } // tested
    public static String getManagerByFullNameQuery(String firstName, String lastName) {
        return String.format("SELECT * " +
                "FROM Manager " +
                "WHERE EmployeeName LIKE '%%%s%%' OR EmployeeName LIKE '%%%s%%';", firstName, lastName);
    } // tested
    public static String getManagerByIDQuery(int id) {
        return String.format("SELECT * FROM Manager WHERE EmployeeID = %d;", id);
    } // tested
    public static String deleteManagerByIDQuery(int id) {
        return String.format("DELETE FROM Manager " +
                "WHERE EmployeeID = %d;" ,id);
    } // tested


    // Queries for StoreTechnician Table
    public static String getAllStoreTechniciansQuery() {
        return "SELECT * " +
                "FROM StoreTechnician;";
    } // tested
    public static String getStoreTechnicianByFirstNameQuery(String name) {
        return String.format("SELECT * " +
                "FROM StoreTechnician " +
                "WHERE EmployeeName LIKE '%%%s%%';", name);
    } // tested
    public static String getStoreTechnicianByFullNameQuery(String firstName, String lastName) {
        return String.format("SELECT * " +
                "FROM StoreTechnician " +
                "WHERE EmployeeName LIKE '%%%s%%' OR EmployeeName LIKE '%%%s%%';", firstName, lastName);
    } // tested
    public static String getStoreTechnicianByIDQuery(int id) {
        return String.format("SELECT * FROM StoreTechnician WHERE EmployeeID = %d;", id);
    } // tested
    public static String deleteStoreTechnicianByIDQuery(int id) {
        return String.format("DELETE FROM StoreTechnician " +
                "WHERE EmployeeID = %d;" ,id);
    } // tested


    // Queries for Customer Table
    public static String getAllCustomersQuery() {
        return "SELECT * " +
                "FROM Customer;";
    } // tested
    public static String getCustomerByFirstNameQuery(String name) {
        return String.format("SELECT * " +
                "FROM Customer " +
                "WHERE CustomerName LIKE '%%%s%%'", name);
    } // tested
    public static String getCustomerByFullNameQuery(String firstName, String lastName) {
        return String.format("SELECT * " +
                "FROM Customer " +
                "WHERE CustomerName LIKE '%%%s%%' OR CustomerName LIKE '%%%s%%';", firstName, lastName);
    } // tested
    public static String getCustomerByIDQuery(int id) {
        return String.format("SELECT * " +
                "FROM Customer " +
                "WHERE CustomerID = %d;", id);
    } // tested
    public static String deleteCustomerByIDQuery(int id) {
        return String.format("DELETE FROM Customer " +
                "WHERE CustomerID = %d;" ,id);
    } // tested


    // ЗАЕБАЛО
    // ЗАЕБАЛО
    // ЗАЕБАЛО

    // Queries for Album Table
    public static String getAllAlbumsQuery() {
        return "SELECT AlbumID, AlbumName, AlbumYear, Price, ArtistName " +
                "FROM Artist, Album " +
                "WHERE Artist.ArtistID = Album.ArtistID";
    } // tested
    public static String getAlbumByNameQuery(String name) {
        return String.format("SELECT AlbumID, AlbumName, AlbumYear, Price, ArtistName " +
                "FROM Album, Artist " +
                "WHERE Album.AlbumName LIKE '%%%s%%' " +
                "AND Album.ArtistID = Artist.ArtistID;", name);
    } // tested
    public static String getAlbumByArtistFirstNameASCPriceQuery(String name) {
        return String.format("SELECT AlbumID, AlbumName, AlbumYear, Price, ArtistName " +
                "FROM Album, Artist a1 " +
                "WHERE Album.ArtistID IN " +
                "(SELECT Artist.ArtistID FROM " +
                "Artist WHERE a1.ArtistName = Artist.ArtistName AND Artist.ArtistName LIKE '%%%s%%');", name);
    } // tested
    public static String getAlbumByArtistFirstNameDESCPriceQuery(String name) {
        return String.format("SELECT AlbumID, AlbumName, AlbumYear, Price, ArtistName " +
                "FROM Album, Artist a1 " +
                "WHERE Album.ArtistID IN " +
                "(SELECT Artist.ArtistID FROM " +
                "Artist WHERE a1.ArtistName = Artist.ArtistName AND Artist.ArtistName LIKE '%%%s%%') " +
                "ORDER BY Price DESC;", name);
    } // tested
    public static String getAlbumByArtistFullNameDESCPriceQuery(String firstName, String lastName) {
        return String.format("SELECT AlbumID, AlbumName, AlbumYear, Price, ArtistName " +
                "FROM Album, Artist a1 " +
                "WHERE Album.ArtistID IN " +
                "(SELECT Artist.ArtistID FROM " +
                "Artist WHERE a1.ArtistName = Artist.ArtistName AND " +
                "(Artist.ArtistName LIKE '%%%s%%' OR Artist.ArtistName LIKE '%%%s%%')) " +
                "ORDER BY Price DESC;", firstName, lastName);
    } // tested
    public static String getAlbumByArtistFullNameASCPriceQuery(String firstName, String lastName) {
        return String.format("SELECT AlbumID, AlbumName, AlbumYear, Price, ArtistName " +
                "FROM Album, Artist a1 " +
                "WHERE Album.ArtistID IN " +
                "(SELECT Artist.ArtistID FROM " +
                "Artist WHERE a1.ArtistName = Artist.ArtistName AND " +
                "(Artist.ArtistName LIKE '%%%s%%' OR Artist.ArtistName LIKE '%%%s%%'));", firstName, lastName);
    } // tested
    public static String getAlbumByID(int id) {
        return String.format("SELECT AlbumID, AlbumName, AlbumYear, Price, ArtistName " +
                "FROM Artist, Album " +
                "WHERE Artist.ArtistID = Album.ArtistID AND AlbumID = %d;", id);
    } // tested
    public static String deleteAlbumByIDQuery(int id) {
        return String.format("DELETE FROM Album " +
                "WHERE AlbumID = %d;" ,id);
    } // tested




    // Queries for Artist Table
    public static String getAllArtistsQuery() {
        return "SELECT * " +
                "FROM ARTIST;";
    } // tested
    public static String getArtistByIDQuery(int artistID) {
        return String.format("SELECT * FROM Artist WHERE ArtistID = %d;", artistID);
    } // tested
    public static String getArtistByFirstNameQuery(String name) {
        return String.format("SELECT * " +
                "FROM Artist " +
                "WHERE ArtistName LIKE '%%%s%%';", name);
    } // tested
    public static String getArtistByFullNameQuery(String firstName, String lastName) {
        return String.format("SELECT * " +
                "FROM Artist " +
                "WHERE ArtistName LIKE '%%%s%%' OR ArtistName LIKE '%%%s%%';", firstName, lastName);
    } // tested
    public static String deleteArtistByIDQuery(int id) {
        return String.format("DELETE FROM Artist " +
                "WHERE ArtistID = %d;" ,id);
    }



}
