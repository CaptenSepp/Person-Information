package com.company;

import java.util.ArrayList;

public class General {
    private String bornPlace;
    private ArrayList<String> livePlaces;
    private String livePlace;
    private String height;

    public void setBornPlace(String bornPlace) {
        this.bornPlace = bornPlace;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getBornPlace() {
        return bornPlace;
    }

    public String getHeight() {
        return height;
    }
    public String addLivePlaces(String livePlace) {
        livePlaces.add(livePlace);
        return livePlace;
    }
}
