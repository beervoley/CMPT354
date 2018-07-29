package API.Model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vsevolod on 2018-07-23.
 */

public class Album {

    private int AlbumID;
    private String AlbumName;
    private int AlbumYear;
    private transient int ArtistID;
    private float Price;
    private String ArtistName;

    public String getArtistName() {
        return ArtistName;
    }

    public int getAlbumID() {
        return AlbumID;
    }

    public String getAlbumName() {
        return AlbumName;
    }

    public int getAlbumYear() {
        return AlbumYear;
    }

    public int getArtistID() {
        return ArtistID;
    }

    public float getPrice() {
        return Price;
    }

    public Album(int albumID, String albumName, int albumYear, int artistID, float price) {
        AlbumID = albumID;
        AlbumName = albumName;
        AlbumYear = albumYear;
        ArtistID = artistID;
        Price = price;
    }

    public Album(String albumName, int albumYear, float price, String artistName, int albumID) {
        AlbumName = albumName;
        AlbumYear = albumYear;
        Price = price;
        ArtistName = artistName;
        AlbumID = albumID;
    }

    public static String buildJSON(ResultSet rset) {
        List<Album> albumList = new ArrayList<>();
        try {
            while (rset.next()) {
                if(rset.getInt("AlbumID") == 0) {
                    continue;
                } else {
                    albumList.add(new Album(rset.getString("AlbumName").trim(),
                            rset.getInt("AlbumYear"),
                            rset.getFloat("Price"),
                            rset.getString("ArtistName").trim(),
                            rset.getInt("AlbumID")));
                }

            }
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            return gson.toJson(albumList);
        } catch (Exception ex) {
            System.out.println("During building a JSON response: " + ex.toString());
        }
        return null;
    }
}
