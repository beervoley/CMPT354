package API.DBCommunication;

import API.Model.Album;
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


    public static String getCDSByFirstName(String name) {
        ResultSet rset = runQuery(Queries.getAlbumByArtistNameQuery(name));
        return buildGSON(rset);
    }

    private static List<Album> getAlbumList(ResultSet rset) {

        List<Album> albumList = new ArrayList<>();
        try {
            while (rset.next()) {

                albumList.add(new Album(rset.getString("AlbumName").trim(),
                        rset.getInt("AlbumYear"), rset.getFloat("Price"),
                        getArtistNameByID(rset.getInt("ArtistID")))
                );
            }
            return albumList;
        } catch (Exception ex) {
            System.out.println("Error during building a JSON: " + ex.toString());
        }
        return null;
    }

    private static String getArtistNameByID(int artistID) {
        ResultSet rs = runQuery(Queries.getArtistNamyByIDQuery(artistID));
        return "";
    }



    private static String buildGSON(ResultSet rset) {
        List<Album> albumList = getAlbumList(rset);
        if(albumList != null) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            return gson.toJson(albumList);
        }
        return "";
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
}
