package org.academiadecodigo.asciimos.bravers.hackathonapp.models;

import org.academiadecodigo.asciimos.bravers.hackathonapp.factories.StepFactory;
import org.academiadecodigo.asciimos.bravers.hackathonapp.models.step.Step;

import java.util.LinkedList;
import java.util.List;

public class ImprovementField {

    private List<Step> stepsList;

    public List<Step> populateList() {
        stepsList = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            stepsList.add(StepFactory.getStep());
        }
        return stepsList;
    }


}
