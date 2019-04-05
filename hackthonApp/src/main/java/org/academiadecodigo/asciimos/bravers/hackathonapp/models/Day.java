package org.academiadecodigo.asciimos.bravers.hackathonapp.models;


import org.academiadecodigo.asciimos.bravers.hackathonapp.models.moods.Mood;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Day {

    private Date date;
    private ImprovementField improvementField;
    private String initialMood;
    private String finalMood;
    private Mood mood;

    @Autowired
    public void setMood(Mood mood) {
        this.mood = mood;
    }

    public Day() {
        date = new Date();
        improvementField = new ImprovementField();
        initialMood = "upbeat";
        finalMood = "boldly-brave";
    }

    public ImprovementField getImprovementField() {
        return improvementField;
    }

    public void setImprovementField(ImprovementField improvementField) {
        this.improvementField = improvementField;
    }

    public String getInitialMood() {
        return initialMood;
    }

    public void setInitialMood(Integer mood) {
        initialMood = this.mood.getMoodType(mood);
    }

    public String getFinalMood() {
        return finalMood;
    }

    public void setFinalMood(Integer mood) {
        this.finalMood = this.mood.getMoodType(mood);
    }

    public void createMoodMap() {
        mood.populateMap();
    }

    public void createStepList() {
        improvementField.populateList();
    }
}
