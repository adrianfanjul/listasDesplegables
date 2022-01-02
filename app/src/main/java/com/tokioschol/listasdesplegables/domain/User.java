package com.tokioschol.listasdesplegables.domain;

public class User {

    private String name;
    private String lastName;
    private Integer age;


    public User(String name, String lastName, Integer age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

}
