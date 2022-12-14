package com.smart.domain;

import java.io.Serializable;

public class Foo implements Serializable {
    private int id;
    private String bar;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBar() {
        return bar;
    }

    public void setBar(String bar) {
        this.bar = bar;
    }
}
