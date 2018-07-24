package Model;

public class Artist {
    private int artistID;
    private String artistName;

    public Artist(){
        this.artistID=-1;
    }

    public int getArtistID() {
        return artistID;
    }

    public void setArtistID(int artistID) {
        this.artistID = artistID;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public Artist(int artistID, String artistName) {

        this.artistID = artistID;
        this.artistName = artistName;
    }
}