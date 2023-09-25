public class Album implements Comparable<Album>{
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


    @Override
    public int compareTo(Album data) {
        return Integer.compare(this.albumSongs, data.albumSongs);
    }

    public int getAlbumSongs() {
        return albumSongs;
    }
}
