package com.jamiesajdak.toptenapp;

public class FeedEntry {
    private String name;
    private String artist;
    private String releaseDate;
    private String price;
    private String imageURL;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public String toString() {
        return  "name=" + name + '\n' +
                "artist=" + artist + '\n' +
                "price=" + price + '\n' +
                "imageURL=" + imageURL + '\n' +
                '}';
    }
}
