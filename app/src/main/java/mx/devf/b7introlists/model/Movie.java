package mx.devf.b7introlists.model;

/**
 * Created by gerardogtn on 11/11/15.
 */
public class Movie {

    private String mTitle;
    private String mGenre;
    private String mProtagonist;

    public Movie(String mTitle, String mGenre) {
        this.mTitle = mTitle;
        this.mGenre = mGenre;
    }

    public Movie(String mTitle, String mGenre, String mProtagonist) {
        this.mTitle = mTitle;
        this.mGenre = mGenre;
        this.mProtagonist = mProtagonist;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }

    public String getGenre() {
        return mGenre;
    }

    public void setGenre(String genre) {
        this.mGenre = genre;
    }

    public String getProtagonist() {
        return mProtagonist;
    }

    public void setProtagonist(String protagonist) {
        this.mProtagonist = protagonist;
    }
}
