package Product;

import java.time.Year;
import java.util.ArrayList;

public class Game {

    private String title;
    private Genre genre;
    private Platform platform;
    private String publisher;
    private double price;
    private Year year;

    public Game(String title, Genre genre, String publisher, Platform platform, double price, Year year ) {
        this.title = title;
        this.genre = genre;
        this.platform = platform;
        this.publisher = publisher;
        this.price = price;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }
}
