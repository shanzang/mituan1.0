package com.example.mituan.ob;

import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private int imgId;
    private String phoneNum;
    private int sex;
    private String introduce;
    private int dongtaiNum;
    private int fansNum;
    private int concernNum;
    private int notWriteMes;

    public User(String name, int imgId, String phoneNum, int sex, String introduce, int dongtaiNum, int fansNum, int concernNum, int notWriteMes) {
        this.name = name;
        this.imgId = imgId;
        this.phoneNum = phoneNum;
        this.sex = sex;
        this.introduce = introduce;
        this.dongtaiNum = dongtaiNum;
        this.fansNum = fansNum;
        this.concernNum = concernNum;
        this.notWriteMes = notWriteMes;
    }

    public User() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public int getDongtaiNum() {
        return dongtaiNum;
    }

    public void setDongtaiNum(int dongtaiNum) {
        this.dongtaiNum = dongtaiNum;
    }

    public int getFansNum() {
        return fansNum;
    }

    public void setFansNum(int fansNum) {
        this.fansNum = fansNum;
    }

    public int getConcernNum() {
        return concernNum;
    }

    public void setConcernNum(int concernNum) {
        this.concernNum = concernNum;
    }

    public int getNotWriteMes() {
        return notWriteMes;
    }

    public void setNotWriteMes(int notWriteMes) {
        this.notWriteMes = notWriteMes;
    }
}
