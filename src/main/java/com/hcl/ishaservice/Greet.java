package com.hcl.ishaservice;

public class Greet {
    private final Long id;
    private final String content;

    public Greet(Long id, String content) {
        this.id = id;
        this.content = content;
    }


    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
