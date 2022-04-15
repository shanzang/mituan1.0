package com.example.mituan.ob;

import java.util.Date;

public class SameCityCar {
    private int imageId;
    private String name;
    private String date;
    private String place;
    private String biaozhu;

    public SameCityCar(int imageId, String name, String date, String place, String biaozhu) {
        this.imageId = imageId;
        this.name = name;
        this.date = date;
        this.place = place;
        this.biaozhu = biaozhu;
    }

    public int getImageId() {
        return imageId;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getPlace() {
        return place;
    }

    public String getBiaozhu() {return biaozhu;}
}
