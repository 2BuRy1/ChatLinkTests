package ru.montana.spring.testoffrontandback.models;

public class Piktovec {

    private String login;
    private String password;

    public Piktovec(String login, String password) {
        this.login = login;
        this.password = password;
    }

    @Override
    public String toString(){
        return this.login + ":" +this.password;
    }
}
