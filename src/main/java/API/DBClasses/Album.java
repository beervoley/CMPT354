package API.DBClasses;

/**
 * Created by vsevolod on 2018-07-23.
 */
public class Album {

    private int AlbumID;
    private String AlbumName;
    private int AlbumYear;
    private String ArtistID;
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

    public String getArtistID() {
        return ArtistID;
    }

    public float getPrice() {
        return Price;
    }

    public Album(int albumID, String albumName, int albumYear, String artistID, float price) {
        AlbumID = albumID;
        AlbumName = albumName;
        AlbumYear = albumYear;
        ArtistID = artistID;
        Price = price;
    }

    public Album(String albumName, int albumYear, float price, String artistName) {
        AlbumName = albumName;
        AlbumYear = albumYear;
        Price = price;
        ArtistName = artistName;
    }
}
