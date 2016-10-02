package sbjr.example.listview.model;

import android.graphics.drawable.Drawable;

/**
 * Created by sbjr on 8/25/16.
 */
public class Movie {

    String title;
    String director;
    String dateOfRelease;
    double rating;
    Drawable poster;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDateOfRelease() {
        return dateOfRelease;
    }

    public void setDateOfRelease(String dateOfRelease) {
        this.dateOfRelease = dateOfRelease;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Drawable getPoster() {
        return poster;
    }

    public void setPoster(Drawable poster) {
        this.poster = poster;
    }


}
