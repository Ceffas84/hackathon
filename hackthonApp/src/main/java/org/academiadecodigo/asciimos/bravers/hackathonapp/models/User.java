package org.academiadecodigo.asciimos.bravers.hackathonapp.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class User {

    private Integer id;
    private int points;
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

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
