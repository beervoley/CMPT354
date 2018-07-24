package API.Model;

/**
 * Created by vsevolod on 2018-07-23.
 */
public class Artist {
    private int ArtistID;
    private String ArtistName;

    public Artist(int artistID, String artistName) {
        ArtistID = artistID;
        ArtistName = artistName;
    }

    public int getArtistID() {
        return ArtistID;
    }

    public String getArtistName() {
        return ArtistName;
    }
}
