package API.DBCommunication;

import API.Model.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vsevolod on 2018-07-23.
 */
public class DBCommun {

    private static Connection getConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection("jdbc:sqlserver://den1.mssql3.gear.host;" +
                    "user=cmpt354;" +
                    "password=Hn9M-8K5G4~2");
        } catch (Exception ex) {
            System.out.println("Connection could not be establihed. Reason: " + ex.toString());
        }
        return null;
    }

    public static String getCDSByFirstName(String name) {
        String query = getAlbumQueryByName(name);
        ResultSet rset = runQuery(query);
        return buildAlbumGSON(rset);
    }

    private static String getAlbumQueryByName(String name) {
        String query = "SELECT AlbumName, AlbumYear, Price " +
                "FROM Album " +
                "WHERE ArtistID IN (SELECT ArtistID FROM Artist WHERE ArtistName LIKE '%"
                + name + "%')" +
                ";";
        return query;
    }

    private static ResultSet runQuery(String query) {
        Connection connection = getConnection();
        if(connection != null) {
            try {
                Statement stl = connection.createStatement();
                ResultSet queryResult = stl.executeQuery(query);
                System.out.println("Query executed successfully");
                return queryResult;
            } catch (Exception ex) {
                System.out.println("Query could not be executed. Reason: " + ex.toString());
            }
        }
        return null;
    }

    private static String buildAlbumGSON(ResultSet rset) {
        List<Album> albumList = new ArrayList<>();
        try {
            while (rset.next()) {
               albumList.add(new Album(rset.getString("AlbumName"),
                       rset.getInt("AlbumYear"), rset.getFloat("Price"))
               );
            }
            Gson gson = new Gson();
            return gson.toJson(albumList);
        } catch (Exception ex) {
            System.out.println("During building a JSON response: " + ex.toString());
        }
        return null;
    }

    private static String buildArtistGSON(ResultSet rset){
        List<Artist> artistList = new ArrayList<>();
        try{
            while (rset.next()) {
                artistList.add(new Artist(rset.getInt("ArtistID"),
                        rset.getString("AlbumName"))
                );
            }
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            return gson.toJson(artistList);
        } catch (Exception ex) {
            System.out.println("During building a JSON response: " + ex.toString());
        }
        return null;
    }

    private static String buildCustomerGSON(ResultSet rset){
        List<Customer> customerList = new ArrayList<>();
        try{
            while (rset.next()) {
                customerList.add(new Customer(rset.getInt("CustomerID"),
                        rset.getString("CustomerName"),
                        rset.getInt("ReferalCount"))
                );
            }
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            return gson.toJson(customerList);
        } catch (Exception ex) {
            System.out.println("During building a JSON response: " + ex.toString());
        }
        return null;
    }

    private static String buildManagerGSON(ResultSet rset) {
        List<Manager> managerList = new ArrayList<>();
        try {
            while (rset.next()) {
                managerList.add(new Manager(rset.getInt("ManagerID"),
                        rset.getString("ManagerName"))
                );
            }
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            return gson.toJson(managerList);
        } catch (Exception ex) {
            System.out.println("During building a JSON response: " + ex.toString());
        }
        return null;
    }

    private static String buildStoreTechnicianGSON(ResultSet rset) {
        List<StoreTechnician> storeTechnicianList = new ArrayList<>();
        try {
            while (rset.next()) {
                storeTechnicianList.add(new StoreTechnician(rset.getInt("ManagerID"),
                        rset.getString("ManagerName"))
                );
            }
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            return gson.toJson(storeTechnicianList);
        } catch (Exception ex) {
            System.out.println("During building a JSON response: " + ex.toString());
        }
        return null;
    }

    private static String buildReceiptGSON(ResultSet rset) {
        List<Receipt> receiptList = new ArrayList<>();
        try {
            while (rset.next()) {
                receiptList.add(new Receipt(rset.getInt("ReceiptID"),
                        rset.getInt("AlbumID"),
                        rset.getInt("CustomerID"),
                        rset.getString("Date"))
                );
            }
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            return gson.toJson(receiptList);
        } catch (Exception ex) {
            System.out.println("During building a JSON response: " + ex.toString());
        }
        return null;
    }
}
