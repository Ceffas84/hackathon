package org.academiadecodigo.asciimos.bravers.hackathonapp.models;

import java.util.Date;

public class Day {

    private Date date;
    private ImprovementField improvementField;
    private Mood initialMood;
    private Mood finalMood;


    public Day (Date date) {
        this.date = date;
    }

    public ImprovementField getImprovementField() {
        return improvementField;
    }

    public void setImprovementField(ImprovementField improvementField) {
        this.improvementField = improvementField;
    }

    public Mood getInitialMood() {
        return initialMood;
    }

    public void setInitialMood(Mood initialMood) {
        this.initialMood = initialMood;
    }

    public Mood getFinalMood() {
        return finalMood;
    }

    public void setFinalMood(Mood finalMood) {
        this.finalMood = finalMood;
    }
}
