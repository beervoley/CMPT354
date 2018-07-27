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
        return Album.buildAlbumGSON(rset);
    }


    private static String getAlbumQueryByName(String name) {
        String query = "SELECT AlbumName, AlbumYear, Price " +
                "FROM Album " +
                "WHERE ArtistID IN (SELECT ArtistID FROM Artist WHERE ArtistName LIKE '%"
                + name + "%')" +
                ";";
        return query;
    }

    public static ResultSet runQuery(String query) {
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
}
