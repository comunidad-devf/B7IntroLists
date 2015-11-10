package mx.devf.b7introlists.model;

/**
 * Created by gerardogtn on 11/9/15.
 */
public class Song {

    private String mTitle;
    private String mArtist;
    private String mAlbum;

    public Song(String title, String artist) {
        this.mTitle = title;
        this.mArtist = artist;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }

    public String getArtist() {
        return mArtist;
    }

    public void setArtist(String artist) {
        this.mArtist = artist;
    }

    public String getAlbum() {
        return mAlbum;
    }

    public void setAlbum(String album) {
        this.mAlbum = album;
    }
}
