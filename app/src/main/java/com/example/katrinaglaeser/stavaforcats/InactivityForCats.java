package com.example.katrinaglaeser.stavaforcats;

/**
 * Created by katrinaglaeser on 9/7/17.
 */

public class InactivityForCats {
    private String inactivity;
    private String name;
    private String photoUrl;

    public InactivityForCats() {
    }
    public InactivityForCats(String inactivity, String name, String photoUrl) {
        this.inactivity = inactivity;
        this.name = name;
        this.photoUrl = photoUrl;
    }
    public String getInactivity() {return inactivity;}

    public void setInactivity(String inactivity) {this.inactivity = inactivity; }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getPhotoUrl() {return photoUrl;}

    public void setPhotoUrl(String photoUrl) {this.photoUrl = photoUrl;}
}
