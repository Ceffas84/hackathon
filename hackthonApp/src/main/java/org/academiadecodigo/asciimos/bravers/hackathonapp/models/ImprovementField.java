package org.academiadecodigo.asciimos.bravers.hackathonapp.models;

import org.academiadecodigo.asciimos.bravers.hackathonapp.factories.StepFactory;
import org.academiadecodigo.asciimos.bravers.hackathonapp.models.step.Step;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
public class ImprovementField {

    private List<Step> stepsList;
    private int count;

    public List<Step> populateList() {
        stepsList = new LinkedList<>();

        for (count = 0; count < 3; count++) {
            stepsList.add(StepFactory.getStep());
        }
        count = 0;
        return stepsList;
    }

    public void destroyStepList() {
        stepsList.clear();
    }

}
