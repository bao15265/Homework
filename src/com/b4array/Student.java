package com.b4array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private String major;

    public Student(int id, String name, String major) {
        this.id = id;
        this.name = name;
        this.major = major;
    }

    public Student() {

    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.major;
    }

    public void bubbleSort(Student[] stu) {
        for (int i = 0; i < stu.length; i++) {
            for (int j = 0; j < stu.length - i - 1; j++) {
                if (stu[j].name.compareTo(stu[j + 1].name) > 0) {
                    Student tmp = stu[j];
                    stu[j] = stu[j + 1];
                    stu[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(stu));
    }

    public void swapObj(Student[] stu) {
        for (int i = 0; i < stu.length; i++) {
            for (int j = i + 1; j < stu.length; j++) {
                if (stu[i].name.compareTo(stu[j].name) > 0) {
                    Student tmp = stu[i];
                    stu[i] = stu[j];
                    stu[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(stu));
    }

    public static void main(String[] args) {
        Student sv1 = new Student(23, "Bob", "CT");
        Student sv2 = new Student(32, "Grey", "KT");
        Student sv3 = new Student(14, "Vision", "XD");
        Student sv4 = new Student(88, "Astra", "ME");
        Student sv5 = new Student(65, "Zack", "ME");
        Student sv6 = new Student(99, "Terra", "XD");
        Student[] students = {sv1, sv2, sv3, sv4, sv5, sv6};
        List<Student> studentList = new ArrayList<>(List.of(students));
        Collections.sort(studentList);
        System.out.println(studentList.toString());
        Student test = new Student();
        test.swapObj(students);
        test.bubbleSort(students);
    }
}
