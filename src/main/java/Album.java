public class Album {
    int artistID;
    String artistName;
    String albumName;
    int albumSongs;

    public Album(int artistID, String artistName, String albumName, int albumSongs) {
        this.artistID = artistID;
        this.artistName = artistName;
        this.albumName = albumName;
        this.albumSongs = albumSongs;
    }
    @Override
    public String toString() {
        return artistID + ": " + albumSongs + " -- [" + artistName + "]";
    }
}
