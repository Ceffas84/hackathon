package org.academiadecodigo.asciimos.bravers.hackathonapp.models.moods;

public enum MoodType {

    BOLDLY_BRAVE("boldly-brave"),
    UPBEAT("upbeat"),
    COLD_FEET("cold-feet"),
    DOWNBEAT("downbeat");

    private String moodString;

    MoodType(String moodString) {
        this.moodString = moodString;
    }

    public String getMoodString() {
        return moodString;
    }
}
