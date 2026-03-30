package com.lesson.composite;

// Bütün çalışanların uymak zorunda olduğu şablon (Component)
public abstract class Developer {
    protected String name;
    protected DeveloperType type;

    public Developer(String name, DeveloperType type) {
        this.name = name;
        this.type = type;
    }

    // Ortak metotlar
    public abstract void addDeveloper(Developer developer);
    public abstract void removeDeveloper(Developer developer);
    public abstract void print();
}

