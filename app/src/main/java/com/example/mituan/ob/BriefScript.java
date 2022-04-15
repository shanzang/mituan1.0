package com.example.mituan.ob;

public class BriefScript {
    private String name;
    private int male;
    private int female;
    private String store;
    private int imageId;

    public BriefScript(String name, int male, int female, String store, int imageId){
        this.name = name;
        this.male = male;
        this.female = female;
        this.store = store;
        this.imageId = imageId;
    }
    public String getName(){
        return name;
    }
    public int getMale(){
        return male;
    }
    public int getFemale(){
        return female;
    }
    public String getStore(){
        return store;
    }
    public int getImageId(){
        return imageId;
    }
}
