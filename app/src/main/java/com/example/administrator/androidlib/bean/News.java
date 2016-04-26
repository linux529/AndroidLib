package com.example.administrator.androidlib.bean;

import org.litepal.crud.DataSupport;

/**
 * Created by pingp on 2016/4/26.
 */
public class News extends DataSupport {
    private String name;
    private int time;
    private Comment comment;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }
}
