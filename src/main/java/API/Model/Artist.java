package API.Model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vsevolod on 2018-07-23.
 */
public class Artist {
    private int ArtistID;
    private String ArtistName;

    public int getArtistID() {
        return ArtistID;
    }

    public String getArtistName() {
        return ArtistName;
    }

    public Artist(int artistID, String artistName) {
        ArtistID = artistID;
        ArtistName = artistName;
    }

    public static String buildArtistGSON(ResultSet rset){
        List<Artist> artistList = new ArrayList<>();
        try{
            while (rset.next()) {
                artistList.add(new Artist(rset.getInt("ArtistID"),
                        rset.getString("ArtistName").trim())
                );
            }
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            return gson.toJson(artistList);
        } catch (Exception ex) {
            System.out.println("During building a JSON response: " + ex.toString());
        }
        return null;
    }
}
