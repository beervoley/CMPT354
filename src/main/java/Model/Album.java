package Model;

public class Album {
    private int albumID;
    private String albumName;
    private int albumYear;
    private int artistID;
    private int price;

    public Album(){
        this.albumID=-1;
    }

    public Album(int albumID, String albumName, int albumYear, int artistID, int price) {
        this.albumID = albumID;
        this.albumName = albumName;
        this.albumYear = albumYear;
        this.artistID = artistID;
        this.price = price;
    }

    public int getAlbumID() {
        return albumID;
    }

    public void setAlbumID(int albumID) {
        this.albumID = albumID;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public int getAlbumYear() {
        return albumYear;
    }

    public void setAlbumYear(int albumYear) {
        this.albumYear = albumYear;
    }

    public int getArtistID() {
        return artistID;
    }

    public void setArtistID(int artistID) {
        this.artistID = artistID;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
