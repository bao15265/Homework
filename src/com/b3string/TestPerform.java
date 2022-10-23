package com.b3string;
//ex 93, line 152
public class TestPerform {
    public static void main(String[] args) {
        int N = 999999;
        long t;

        String str = new String();
        t = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            str = str + "something";
        }
        System.out.println("String time = " + (System.currentTimeMillis() - t));

        StringBuffer sbr = new StringBuffer();
        t = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            sbr.append("something");
        }
        System.out.println("StringBuffer time = " + (System.currentTimeMillis() - t));

        StringBuilder sbl = new StringBuilder();
        t = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            sbl.append("something");
        }
        System.out.println("StringBuilder time = " + (System.currentTimeMillis() - t));
    }
}