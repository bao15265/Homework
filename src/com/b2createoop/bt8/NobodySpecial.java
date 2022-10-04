package com.b2createoop.bt8;

public class NobodySpecial extends Human implements Plumber, Electrician {

    public NobodySpecial(String name) {
        super(name);
    }

    @Override
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
