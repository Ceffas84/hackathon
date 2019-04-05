package org.academiadecodigo.asciimos.bravers.hackathonapp.services;

import org.academiadecodigo.asciimos.bravers.hackathonapp.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private User user;
    private DayService dayService;

    @Autowired
    public void setUser(User user) {
        this.user = user;
    }

    @Autowired
    public void setDayService(DayService dayService) {
        this.dayService = dayService;
    }

    public User createUser() {
        return new User();
    }

    public void setDay() {
        user.setDay(dayService.createDay());
    }

    public int getPoints() {
        return user.getPoints();
    }

    public void setPoints() {
        user.setPoints();
    }
}


