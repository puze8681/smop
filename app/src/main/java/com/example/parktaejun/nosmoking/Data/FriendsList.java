package com.example.parktaejun.nosmoking.Data;

/**
 * Created by parktaejun on 2017. 7. 9..
 */

public class FriendsList {
    private String name;
    private String howLong;

    public FriendsList(String name, String howLong){
        this.name = name;
        this.howLong = howLong;
    }

    public String getName(){
        return name;
    }

    public String getLong(){
        return howLong;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setLong(String howLong){
        this.howLong = howLong;
    }
}
