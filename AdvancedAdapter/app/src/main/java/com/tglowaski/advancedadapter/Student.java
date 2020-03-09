package com.tglowaski.advancedadapter;

public class Student {

    private String firstName;
    private String lastName;
    private String major;

    public Student(String firstName, String lastName, String major){
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;

    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
