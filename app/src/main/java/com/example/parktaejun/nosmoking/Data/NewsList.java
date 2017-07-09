package com.example.parktaejun.nosmoking.Data;

/**
 * Created by parktaejun on 2017. 7. 9..
 */

public class NewsList {
    private String news;
    private String last;

    public NewsList(String news, String last){
        this.news = news;
        this.last = last;
    }

    public String getNews(){
        return news;
    }

    public String getLast(){
        return last;
    }

    public void setNews(String news){
        this.news = news;
    }

    public void setLast(String last){
        this.last = last;
    }
}
