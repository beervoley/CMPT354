/**
 *
 * created by rishabh bhargava - 23/7
 * untested at the moment, makes and breaks connection to DB
 * accepts query commands , used by SPRING controller class
 * need to change OBJECT 's into whatever input is needed
 *
 */

package API.DBCommunication;

import API.Model.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SQLDB {

    private Connection connection;

    public Connection getConnection(){
        return connection;
    }

    public void makeConnection() throws SQLException, ClassNotFoundException{

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        connection = DriverManager.getConnection("jdbc:sqlserver://cypress.csil.sfu.ca;" +
                "user=c354g14;" +
                "password=46T7EmhHL7jjgrG7");
        System.out.println(connection.getCatalog());

    }

    public void closeConnection() throws SQLException {
        connection.close();
    }

        //CREATE NEW ROW IN SOME TABLE IN DB

    public boolean createEmployee(Object o){
        String query = "INSERT INTO Employee VALUES " + o;
        return true;
    }
    public boolean createArtist(Object o){
        return true;
    }
    public boolean createCD(Object o){
        return true;
    }

        //DELETE ROW IN SOME TABLE DB

    public boolean deleteCD(Object o,int id){
        return true;
    }
    public boolean deleteArtist(Object o,int id){
        return true;
    }
    public boolean deleteEmployee(Object o,int id){
        return true;
    }

        //UPDATE ROW IN SOME TABLE IN DB

    public boolean updateEmployee(Object o,int id){
        return true;
    }
    public boolean updateArtist(Object o,int id){
        return true;
    }
    public boolean updateCD(Object o,int id){
        return true;
    }

        //SEARCH WITH PARAMETERS

        //JOIN TABLE AND SHIT
        //


        //LIST ALL ROWS IN SOME TABLE IN DB

    public List<Album> getAllAlbums() throws SQLException {
        List<Album> albums = new ArrayList<>();
        String query = "SELECT DISTINCT * FROM Album";
        Statement s = connection.createStatement();
        ResultSet rs = s.executeQuery(query);
        while(rs.next()){
            int albumID = rs.getInt("AlbumID");
            String albumName = rs.getString("AlbumName");
            int albumYear = rs.getInt("AlbumYear");
            int artistID = rs.getInt("ArtistID");
            int price = rs.getInt("Price");

            albums.add(new Album(albumID,albumName,albumYear,artistID,price));
        }
        return albums;
    }

    public List<Artist> getAllArtists() throws SQLException {
        List<Artist> artists = new ArrayList<>();

        String query = "SELECT DISTINCT * FROM Artist";
        Statement s = connection.createStatement();
        ResultSet rs = s.executeQuery(query);
        while(rs.next()){
            int albumID = rs.getInt("ArtistID");
            String albumName = rs.getString("ArtistName");
            int albumYear = rs.getInt("AlbumYear");
            int artistID = rs.getInt("ArtistID");

            artists.add(new Artist(albumID,albumName));
        }
        return artists;
    }

    public List<Customer> getAllCustomers() throws SQLException {
        List<Customer> customers = new ArrayList<>();

        String query = "SELECT DISTINCT * FROM Customer";
        Statement s = connection.createStatement();
        ResultSet rs = s.executeQuery(query);
        while(rs.next()){

            int customerID = rs.getInt("CustomerID");
            String customerName = rs.getString("CustomerName");
            int referralCount = rs.getInt("ReferralCount");
            customers.add(new Customer(customerID,customerName,referralCount));

        }
        return customers;
    }
    public List<Manager> getAllManagers() throws SQLException {
        List<Manager> managers = new ArrayList<>();

        String query = "SELECT DISTINCT * FROM Manager";
        Statement s = connection.createStatement();
        ResultSet rs = s.executeQuery(query);
        while(rs.next()){

            int employeeID = rs.getInt("EmployeeID");
            String employeeName = rs.getString("EmployeeName");
            managers.add(new Manager(employeeID,employeeName));

        }
        return managers;
    }

    public List<StoreTechnician> getAllStoreTechnicians() throws SQLException {
        List<StoreTechnician> storeTechnicians = new ArrayList<>();

        String query = "SELECT DISTINCT * FROM StoreTechnician";
        Statement s = connection.createStatement();
        ResultSet rs = s.executeQuery(query);
        while(rs.next()){

            int employeeID = rs.getInt("EmployeeID");
            String employeeName = rs.getString("EmployeeName");
            storeTechnicians.add(new StoreTechnician(employeeID,employeeName));

        }
        return storeTechnicians;
    }

    public List<Receipt> getAllReceipts() throws SQLException {
        List<Receipt> receipts = new ArrayList<>();

        String query = "SELECT DISTINCT * FROM Receipt";
        Statement s = connection.createStatement();
        ResultSet rs = s.executeQuery(query);
        while(rs.next()){

            int receiptID = rs.getInt("receiptID");
            int albumID = rs.getInt("albumID");
            int customerID = rs.getInt("customerID");
            String date = rs.getString("date");
            receipts.add(new Receipt(receiptID,albumID,customerID,date));

        }
        return receipts;
    }

        //LIST SINGLE ROW IN SOME TABLE IN DB

    public Album getAlbum(int id) throws SQLException{

        String query="SELECT * FROM Album WHERE AlbumID = " + id;
        Statement s = connection.createStatement();
        ResultSet rs = s.executeQuery(query);

        if(rs.first()){
            int albumID = rs.getInt("AlbumID");
            String albumName = rs.getString("AlbumName");
            int albumYear = rs.getInt("AlbumYear");
            int artistID = rs.getInt("ArtistID");
            int price = rs.getInt("Price");

            return new Album(albumID,albumName,albumYear,artistID,price);

        }
        else{
            return null;
        }
    }

    public Artist getArtist(int id) throws SQLException{

        String query="SELECT * FROM Artist WHERE ArtistID = " + id;
        Statement s = connection.createStatement();
        ResultSet rs = s.executeQuery(query);

        if(rs.first()){
            int artistID = rs.getInt("ArtistID");
            String artistName = rs.getString("ArtistName");
            return new Artist(artistID,artistName);
        }
        else{
            return null;
        }
    }

    public Customer getCustomer(int id) throws SQLException{
        String query="SELECT * FROM Customer WHERE CustomerID = " + id;
        Statement s = connection.createStatement();
        ResultSet rs = s.executeQuery(query);

        if(rs.first()){
            int customerID = rs.getInt("CustomerID");
            String customerName = rs.getString("CustomerName");
            int referralCount = rs.getInt("ReferralCount");
            return new Customer(customerID,customerName,referralCount);
        }
        else{
            return null;
        }
    }

    public Manager getManager(int id) throws SQLException{
        String query="SELECT * FROM Manager WHERE EmployeeID = " + id;
        Statement s = connection.createStatement();
        ResultSet rs = s.executeQuery(query);

        if(rs.first()){
            int employeeID = rs.getInt("EmployeeID");
            String employeeName = rs.getString("EmployeeName");
            return new Manager(employeeID,employeeName);
        }
        else{
            return null;
        }
    }

    public StoreTechnician getStoreTechnician(int id) throws SQLException{
        String query="SELECT * FROM StoreTechnician WHERE EmployeeID = " + id;
        Statement s = connection.createStatement();
        ResultSet rs = s.executeQuery(query);

        if(rs.first()){
            int employeeID = rs.getInt("EmployeeID");
            String employeeName = rs.getString("EmployeeName");
            return new StoreTechnician(employeeID,employeeName);
        }
        else{
            return null;
        }
    }

    public Receipt getReceipt(int id) throws SQLException{
        String query="SELECT * FROM Receipt WHERE ReceiptID = " + id;
        Statement s = connection.createStatement();
        ResultSet rs = s.executeQuery(query);

        if(rs.first()) {
            int receiptID = rs.getInt("receiptID");
            int albumID = rs.getInt("albumID");
            int customerID = rs.getInt("customerID");
            String date = rs.getString("date");
            return new Receipt(receiptID, albumID, customerID, date);
        }
        else{
            return null;
        }
    }

}
