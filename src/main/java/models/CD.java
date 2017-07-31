package models;

/**
 * Created by Guest on 7/31/17.
 */
public class CD {
    public String artistName;
    public String albumName;
    public int releaseYr;
    public float price;

    public CD (String artistName, String albumName, int releaseYr, float price) {
        this.artistName = artistName;
        this.albumName = albumName;
        this.releaseYr = releaseYr;
        this.price = price;
    }

}
