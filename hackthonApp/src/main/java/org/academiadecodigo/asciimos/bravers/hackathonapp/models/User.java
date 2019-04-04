package org.academiadecodigo.asciimos.bravers.hackathonapp.models;

public class User {

    private Integer id;
    private Day day;

    public User(Day day) {
        this.day = day;
    }

    public Day getDay() {
        return day;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDay(Day day) {
        this.day = day;
    }
}
