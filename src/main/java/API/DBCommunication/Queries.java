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
    public static String getAlbumByID(int id) {
        return String.format("SELECT AlbumID, AlbumName, AlbumYear, Price, ArtistName " +
                "FROM Artist, Album " +
                "WHERE Artist.ArtistID = Album.ArtistID AND AlbumID = %d;", id);
    } // tested


    public static String getAlbumByOneSearchStringASC(String s1) {

        return String.format("SELECT AlbumID, AlbumName, AlbumYear, Price, ArtistName " +
                "FROM Album, Artist a1 " +
                "WHERE Album.ArtistID = a1.ArtistID AND (a1.ArtistName LIKE '%%%s%%' " +
                "OR Album.AlbumName LIKE '%%%s%%') " +
                "ORDER BY Price;", s1, s1);
    }

    public static String getAlbumByOneSearchStringDESC(String s1) {

        return String.format("SELECT AlbumID, AlbumName, AlbumYear, Price, ArtistName " +
                "FROM Album, Artist a1 " +
                "WHERE Album.ArtistID = a1.ArtistID AND (a1.ArtistName LIKE '%%%s%%' " +
                "OR Album.AlbumName LIKE '%%%s%%') " +
                "ORDER BY Price DESC;", s1, s1);
    }




    public static String getAlbumByTwoSearchStringASC(String s1, String s2) {

        return String.format("SELECT AlbumID, AlbumName, AlbumYear, Price, ArtistName " +
                "FROM Album, Artist a1 " +
                "WHERE Album.ArtistID = a1.ArtistID AND (a1.ArtistName LIKE '%%%s%%' " +
                "OR Album.AlbumName LIKE '%%%s%%' " +
                "OR a1.ArtistName LIKE '%%%s%%' " +
                "OR Album.AlbumName LIKE '%%%s%%') " +
                "ORDER BY Price;", s1, s1, s2, s2);
    }

    public static String getAlbumByTwoSearchStringDESC(String s1, String s2) {

        return String.format("SELECT AlbumID, AlbumName, AlbumYear, Price, ArtistName " +
                "FROM Album, Artist a1 " +
                "WHERE Album.ArtistID = a1.ArtistID AND (a1.ArtistName LIKE '%%%s%%' " +
                "OR Album.AlbumName LIKE '%%%s%%' " +
                "OR a1.ArtistName LIKE '%%%s%%' " +
                "OR Album.AlbumName LIKE '%%%s%%') " +
                "ORDER BY Price DESC;", s1, s1, s2, s2);
    }


    public static String deleteAlbumByIDQuery(int id) {
        return String.format("DELETE FROM Album " +
                "WHERE AlbumID = %d;" ,id);
    } // tested




    // Queries for Artist Table
    public static String getAllArtistsQuery() {
        return "SELECT * " +
                "FROM ARTIST;";
    } // tested
    public static String getArtistByIDQuery(int id) {
        return String.format("SELECT * FROM Artist WHERE ArtistID = %d;", id);
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



    // Queries for Receipt Table

    public static String getAllReceiptsQuery() {
        return "SELECT * " +
                "FROM Receipt;";
    } // tested
    public static String getReceiptByIDQuery(int id) {
        return String.format("SELECT * FROM Receipt WHERE ReceiptID = %d;", id);
    } // tested
    public static String getReceiptsByCustomerNameQuery(String name) {
        return String.format("SELECT ReceiptID, Date, Album.AlbumID as AlbumID, Customer.CustomerID as CustomerID, Album.Price, CustomerName, AlbumName " +
                "FROM Receipt, Customer, Album " +
                "WHERE CustomerName LIKE '%%%s%%' AND Receipt.CustomerID = Customer.CustomerID " +
                "AND Receipt.AlbumID = Album.AlbumID " +
                "ORDER BY Album.price DESC;", name);
    } // tested
    public static String getReceiptsByCustomerFullNameQuery(String firstName, String lastName) {
        return String.format("SELECT ReceiptID, Date, Album.AlbumID as AlbumID, Customer.CustomerID as CustomerID, Album.Price, CustomerName, AlbumName " +
                "FROM Receipt, Customer, Album " +
                "WHERE (CustomerName LIKE '%%%s%%' OR CustomerName LIKE '%%%s%%') " +
                "AND Receipt.CustomerID = Customer.CustomerID " +
                "AND Receipt.AlbumID = Album.AlbumID " +
                "ORDER BY Album.price DESC;", firstName, lastName);
    } // tested
    public static String getReceiptsByAlbumNameQuery(String name) {
        return String.format("SELECT ReceiptID, Date, Album.AlbumID as AlbumID, Customer.CustomerID as CustomerID, Album.Price, CustomerName, AlbumName " +
                "FROM Receipt, Customer, Album " +
                "WHERE AlbumName LIKE '%%%s%%' AND Receipt.CustomerID = Customer.CustomerID " +
                "AND Receipt.AlbumID = Album.AlbumID " +
                "ORDER BY Album.price DESC;", name);
    } //
    public static String getReceiptsByCustomerIDQuery(int id) {
        return String.format("SELECT ReceiptID, Date, Album.AlbumID as AlbumID, Customer.CustomerID as CustomerID, Album.Price, CustomerName, AlbumName " +
                "FROM Receipt, Customer, Album " +
                "WHERE Receipt.CustomerID = %d AND Receipt.CustomerID = Customer.CustomerID " +
                "AND Receipt.AlbumID = Album.AlbumID " +
                "ORDER BY Album.price DESC;", id);
    }
    public static String getReceiptsByAlbumIDQuery(int id) {
        return String.format("SELECT ReceiptID, Date, Album.AlbumID as AlbumID, Customer.CustomerID as CustomerID, Album.Price, CustomerName, AlbumName " +
                "FROM Receipt, Customer, Album " +
                "WHERE Receipt.AlbumID = %d AND Receipt.CustomerID = Customer.CustomerID " +
                "AND Receipt.AlbumID = Album.AlbumID " +
                "ORDER BY Album.price DESC;", id);
    }




}
