package org.academiadecodigo.asciimos.bravers.hackathonapp.services;

import org.academiadecodigo.asciimos.bravers.hackathonapp.models.step.Step;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StepService {

    private Step step;

    @Autowired
    public void setStep(Step step) {
        this.step = step;
    }

    public void turnToAchieved() {
        step.setAchieved();
    }
}
