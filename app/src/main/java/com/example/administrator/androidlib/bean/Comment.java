package com.example.administrator.androidlib.bean;

import org.litepal.crud.DataSupport;

/**
 * Created by pingp on 2016/4/26.
 */
public class Comment extends DataSupport {
    private String content;
    private int serila;
    private Person person;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getSerila() {
        return serila;
    }

    public void setSerila(int serila) {
        this.serila = serila;
    }
}
