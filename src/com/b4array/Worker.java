package com.b4array;

import java.util.*;

public class Worker implements Comparable<Worker> {
    private String name;

    public Worker(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Worker o) {
        return this.name.compareTo(o.name);
    }

    public String toString() {
        return this.name;
    }

    public static Comparator<Worker> LengthComparator = new Comparator<Worker>() {
        @Override
        public int compare(Worker o1, Worker o2) {
            return o1.name.length() - o2.name.length();
        }
    };

    public static void main(String[] args) {
        HashSet<Worker> hashSet = new HashSet<>();
        hashSet.add(new Worker("Bob"));
        hashSet.add(new Worker("Grey"));
        hashSet.add(new Worker("Xander"));
        hashSet.add(new Worker("Vision"));
        hashSet.add(new Worker("Astra"));
        hashSet.add(new Worker("Zack"));
        hashSet.add(new Worker("Terra"));

        System.out.println(hashSet);
        TreeSet<Worker> treeSet = new TreeSet<>(hashSet);
        System.out.println(treeSet);
        List<Worker> list = new ArrayList<>(hashSet);
        Collections.sort(list, Worker.LengthComparator);
        System.out.println(list);
    }
}
