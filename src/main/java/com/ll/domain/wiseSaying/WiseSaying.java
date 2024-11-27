package com.ll.domain.wiseSaying;

import java.util.Formatter;

public class WiseSaying {
    private int id;
    private String content;
    private String author;

    public WiseSaying(int id, String contnet, String author) {
        this.id = id;
        this.content = contnet;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}