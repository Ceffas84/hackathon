package org.academiadecodigo.asciimos.bravers.hackathonapp.models;

import org.academiadecodigo.asciimos.bravers.hackathonapp.models.mood.Mood;

import java.util.Date;

public class Day {

    private Date date;
    private ImprovementField improvementField;
    private String initialMood;
    private String finalMood;
    private Mood mood;


    public Day (Date date) {
        this.date = date;
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
}
