package com.b3string;


public class Main {
    public static void main(String[] args) {
        StringExercise test = new StringExercise();
        test.setStr("Lorem Ipsum is simply dummy text of the printing and typesetting industry\n Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.\n   It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.\n      It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum");
        String text1 = test.getStr();
        String[] word = {"Gamma", "Beta", "Alpha", "Omega", "Zeta", "Lambda"};
        System.out.println(test.addPrefix(text1, "ALo aniwad"));
    }
}