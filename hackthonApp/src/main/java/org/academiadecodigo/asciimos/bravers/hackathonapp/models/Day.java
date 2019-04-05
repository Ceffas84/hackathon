package org.academiadecodigo.asciimos.bravers.hackathonapp.models;


import org.academiadecodigo.asciimos.bravers.hackathonapp.models.moods.Mood;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Day {

    private Date date;
    private ImprovementField improvementField;
    private String initialMood;
    private String finalMood;
    private Mood mood;


    public Day () {
        date = new Date();
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

    public void setInitialMood(Integer key) {
        this.initialMood = mood.getMoodType(key).getMoodString();
    }

    public String getFinalMood() {
        return finalMood;
    }

    public void setFinalMood(Integer key) {
        this.finalMood = mood.getMoodType(key).getMoodString();
    }

    public void createMoodMap() {
        mood.populateMap();
    }

    public void createStepList() {
        improvementField.populateList();
    }
}
