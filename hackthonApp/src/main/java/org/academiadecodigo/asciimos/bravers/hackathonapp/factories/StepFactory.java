package org.academiadecodigo.asciimos.bravers.hackathonapp.factories;

import org.academiadecodigo.asciimos.bravers.hackathonapp.models.step.Step;
import org.academiadecodigo.asciimos.bravers.hackathonapp.models.step.StepMessage;

public class StepFactory {

    private static Step STEP;
    private static int count;

    public static Step getStep() {

        StepMessage[] possibleSteps = StepMessage.values();

        STEP = new Step(false, possibleSteps[count].getMessage());

        count++;

        return STEP;
    }

    public static void resetCount() {
        count = 0;
    }

}
