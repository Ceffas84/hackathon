package org.academiadecodigo.asciimos.bravers.hackathonapp.models.mood;

import java.util.HashMap;
import java.util.Map;

public class Mood {

    private MoodType moodType;
    private Map<Integer, MoodType> moods = new HashMap<>();

    public void populateMap() {
        moods.put(1, MoodType.BOLDLY_BRAVE);
        moods.put(2, MoodType.UPBEAT);
        moods.put(3, MoodType.COLD_FEET);
        moods.put(4, MoodType.DOWNBEAT);
    }

    public MoodType getMoodType(Integer key) {
        return moods.get(key);
    }

}
