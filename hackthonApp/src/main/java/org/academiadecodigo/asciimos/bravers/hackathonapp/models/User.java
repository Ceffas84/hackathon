package org.academiadecodigo.asciimos.bravers.hackathonapp.models;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;

@Component
public class User {

    private Integer id;


    private Integer points;
    private Day day;

    public User() {
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

    public Integer getPoints() {
        return points;
    }

    public void setPoints() {
        if (points == 0) {
            points = points + 2;
        }
        points = points * 2;
    }
}
