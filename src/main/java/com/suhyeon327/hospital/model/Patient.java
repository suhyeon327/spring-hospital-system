package com.suhyeon327.hospital.model;

public class Patient {

    private static int sequence = 1;

    private int id;
    private String name;
    private int age;

    public Patient(String name, int age) {
        this.id = sequence++;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
