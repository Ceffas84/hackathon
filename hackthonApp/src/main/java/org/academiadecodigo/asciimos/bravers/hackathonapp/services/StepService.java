package org.academiadecodigo.asciimos.bravers.hackathonapp.services;

import org.academiadecodigo.asciimos.bravers.hackathonapp.models.step.Step;
import org.springframework.stereotype.Service;

@Service
public class StepService {

    private Step step;

    public void turnToAchieved() {
        step.setAchieved();
    }
}
