package com.b2createoop.bt9;

import com.b2createoop.bt9.Dog;

public class Head extends Dog {
    protected String size;

    public Head(String size) {
        super();
        this.size = size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }
}
