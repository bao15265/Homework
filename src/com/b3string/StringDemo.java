package com.b3string;

import java.util.ArrayList;
import java.util.List;

public class StringDemo {
    private String str;
    private String findStr;
    private int count = 0;
    private int lastIndex = 0;

    public String replaceStr(String str, String findStr, int count) {
        List<Integer> arl = new ArrayList<>();
        int len = findStr.length();
        while ((lastIndex = str.indexOf(findStr, lastIndex)) != -1) {
            lastIndex += len;
            arl.add(lastIndex);
        }
        int num = arl.toArray().length;
        if (count < 0) {
            this.str = str.substring(0, arl.get(0) - len) + "$" + str.substring(arl.get(0));
        } else if (count > num) {
            this.str = str.substring(0, arl.get(num - 1) - len) + "$" + str.substring(arl.get(num - 1));
        } else {
            this.str = str.substring(0, arl.get(count) - len) + "$" + str.substring(arl.get(count));
        }
        return this.str;
    }

    public static void main(String[] args) {
        String str = " java stri java ng splitjava mjava ejavankj=java thod java";
        String findStr = "java";
        StringDemo sd = new StringDemo();
        int count = 6;
        String text = sd.replaceStr(str, findStr, count);
        System.out.println(text);
    }
}