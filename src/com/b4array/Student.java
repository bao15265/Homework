package com.b4array;

import java.util.*;

public class Student implements Comparable<Student> {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }

    public String toString() {
        return this.name;
    }

    public static Comparator<Student> LengthComparator = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.name.length() - o2.name.length();
        }
    };

    public static void main(String[] args) {
        HashSet<Student> hashSet = new HashSet<>();
        hashSet.add(new Student("Bob"));
        hashSet.add(new Student("Grey"));
        hashSet.add(new Student("Xander"));
        hashSet.add(new Student("Vision"));
        hashSet.add(new Student("Astra"));
        hashSet.add(new Student("Zack"));
        hashSet.add(new Student("Terra"));

        System.out.println(hashSet);
        TreeSet<Student> treeSet = new TreeSet<>(hashSet);
        System.out.println(treeSet);
        List<Student> list = new ArrayList<>(hashSet);
        Collections.sort(list, Student.LengthComparator);
        System.out.println(list);
    }
}
