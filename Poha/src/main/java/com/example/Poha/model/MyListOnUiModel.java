package com.example.Poha.model;

public class MyListOnUiModel {

    String name;
    int age;
    int height;
    String choice;
    String preference;

    public MyListOnUiModel(String name, int age, String choice, String preference) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.choice = choice;
        this.preference = preference;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public String getPreference() {
        return preference;
    }

    public void setPreference(String preference) {
        this.preference = preference;
    }
}
