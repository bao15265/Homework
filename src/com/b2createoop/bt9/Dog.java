package com.b2createoop.bt9;

public class Dog extends Mammal implements Nameable {
    protected String name;

    public Dog(String name) {
        super();
        this.name = name;
    }

    public Dog() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
