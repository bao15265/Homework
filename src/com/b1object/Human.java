package com.b1object;

public class Human
{
    public void walk()
    {
        System.out.println("i'm walking");
    }
    public void eat()
    {
        System.out.println("i'm eating");
    }
    public static void main(String[] args)
    {
        Human Humen = new Human();
        Humen.walk();
        Humen.eat();
    }
}