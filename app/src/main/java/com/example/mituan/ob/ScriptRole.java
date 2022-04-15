package com.example.mituan.ob;

public class ScriptRole {
    private int sid;
    private String name;
    private String introdduce;

    public ScriptRole(int sid, String name, String introdduce) {
        this.sid = sid;
        this.name = name;
        this.introdduce = introdduce;
    }

    public ScriptRole(String name, String introdduce) {
        this.name = name;
        this.introdduce = introdduce;
    }
    public ScriptRole(){}

    public int getSid() {
        return sid;
    }

    public String getName() {
        return name;
    }

    public String getIntrodduce() {
        return introdduce;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIntrodduce(String introdduce) {
        this.introdduce = introdduce;
    }
}
