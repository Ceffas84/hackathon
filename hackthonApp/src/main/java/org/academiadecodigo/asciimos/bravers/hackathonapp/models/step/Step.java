package org.academiadecodigo.asciimos.bravers.hackathonapp.models.step;

public class Step {

    private boolean isAchieved;
    private String message;
    private Integer dificultyLevel;


    public Step (boolean isAchieved, String message) {
        this.isAchieved = isAchieved;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setAchieved() {
        isAchieved = true;
    }
}
