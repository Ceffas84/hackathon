package org.academiadecodigo.asciimos.bravers.hackathonapp.services;

import org.academiadecodigo.asciimos.bravers.hackathonapp.models.Day;
import org.academiadecodigo.asciimos.bravers.hackathonapp.models.ImprovementField;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DayService {

    private Day day;

    @Autowired
    public void setDay(Day day) {
        this.day = day;
    }

    public Day createDay() {
        return new Day();
    }

    public void setInitialMood(Integer key) {
        day.setInitialMood(key);
    }

    public void setImprovementField(ImprovementField improvementField) {
        day.setImprovementField(improvementField);
    }

    public void createMoodMap() {
        day.createMoodMap();
    }

    public void createStepList() {
        day.createStepList();
    }

    public void setFinalMood(Integer key) {
        day.setFinalMood(key);
    }
}
