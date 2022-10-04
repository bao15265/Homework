package com.b2createoop.bt8;

public class HandyPerson extends Human implements Plumber, Electrician {
    public HandyPerson(String name) {
        super(name);
    }

    public String unplugDrain() {
        return null;
    }

    @Override
    public String changeBulb() {
        return null;
    }

    public String toString() {
        return super.toString();
    }
}
