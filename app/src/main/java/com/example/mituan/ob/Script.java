package com.example.mituan.ob;

import java.io.Serializable;
import java.util.Map;

public class Script implements Serializable {
    private String name;
    private int imgId;
    private double score;
    private int maleNum;
    private int femaleNum;
    private String label;
    private String briefIntroduce;
    private int roleId;

    public Script(String name, double score, int maleNum, int femaleNum, String label, String briefIntroduce, int roleId) {
        this.name = name;
        this.score = score;
        this.maleNum = maleNum;
        this.femaleNum = femaleNum;
        this.label = label;
        this.briefIntroduce = briefIntroduce;
        this.roleId = roleId;
    }

    public Script() {
    }

    public Script(String name, int imgId, double score, int maleNum, int femaleNum, String label, String briefIntroduce) {
        this.name = name;
        this.imgId = imgId;
        this.score = score;
        this.maleNum = maleNum;
        this.femaleNum = femaleNum;
        this.label = label;
        this.briefIntroduce = briefIntroduce;
    }

    public int getImgId() {
        return imgId;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public int getMaleNum() {
        return maleNum;
    }

    public int getFemaleNum() {
        return femaleNum;
    }

    public String getLabel() {
        return label;
    }

    public String getBriefIntroduce() {
        return briefIntroduce;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void setMaleNum(int maleNum) {
        this.maleNum = maleNum;
    }

    public void setFemaleNum(int femaleNum) {
        this.femaleNum = femaleNum;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setBriefIntroduce(String briefIntroduce) {
        this.briefIntroduce = briefIntroduce;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }
}
