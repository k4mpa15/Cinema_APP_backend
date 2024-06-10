package pl.wat.backend.dto;

import java.util.Date;

public class RepertuarDTO {

    private String movieName;
    private Date showDate;
    private String showTime;
    private int duration;
    private int rating;

    // Konstruktor
    public RepertuarDTO(String movieName, Date showDate, String showTime, int duration, int rating) {
        this.movieName = movieName;
        this.showDate = showDate;
        this.showTime = showTime;
        this.duration = duration;
        this.rating = rating;
    }

    // Gettery i Settery
    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Date getShowDate() {
        return showDate;
    }

    public void setShowDate(Date showDate) {
        this.showDate = showDate;
    }

    public String getShowTime() {
        return showTime;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
