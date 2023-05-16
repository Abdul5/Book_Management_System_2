package com.example.bookManageSystem_CRUD;

public class Author {
    private String name;
    private int age;
    private char gender;
    private float rating;

    public Author(String name, int age, char gender, float rating) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public float getRating() {
        return rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
