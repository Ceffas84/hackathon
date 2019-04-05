package org.academiadecodigo.asciimos.bravers.hackathonapp.models.step;

public enum StepMessage {
    FIRST("Test One"),
    SECOND("Test Two"),
    THREE("Test Three");


    private String message;

    StepMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
