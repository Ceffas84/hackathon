package org.academiadecodigo.asciimos.bravers.hackathonapp.models.moods;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class Mood {

    private Map<Integer, String> moods = new HashMap<>();

    public void populateMap() {
        moods.put(1, MoodType.BOLDLY_BRAVE.getMoodString());
        moods.put(2, MoodType.UPBEAT.getMoodString());
        moods.put(3, MoodType.COLD_FEET.getMoodString());
        moods.put(4, MoodType.DOWNBEAT.getMoodString());
    }


    /*private MoodType[] possibleMoods;

    public void moods() {
       String brave = "boldly-brave";
       String upbeat = "upbeat";
       String cold = "cold-feet";
       String downbeat = "downbeat";
    }*/

    public String getMoodType(Integer mood) {
        return moods.get(mood);
    }

}
