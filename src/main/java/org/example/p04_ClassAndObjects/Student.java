package org.example.p04_ClassAndObjects;

public class Student {

    private String name;
    private long phoneNumber;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, long phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
