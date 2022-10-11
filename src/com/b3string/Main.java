package com.b3string;


public class Main {
    public static void main(String[] args) {
        StringExercise test = new StringExercise();
        test.setStr("google");
        String text1 = test.getStr();
        String[] word = {"Gamma", "Beta", "Alpha", "Omega", "Zeta", "Lambda"};
        System.out.println(test.replaceChar(text1));
    }
}