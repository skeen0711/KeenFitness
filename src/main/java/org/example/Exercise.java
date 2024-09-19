package org.example;

public class Exercise {
    private String description;
    private String majorMusclesWorked;
    private String minorMusclesWorked;
    private int ratePerceivedEffort;

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setMajorMusclesWorked(String majorMusclesWorked) {
        this.majorMusclesWorked = majorMusclesWorked;
    }

    public String getMajorMusclesWorked(){
        return majorMusclesWorked;
    }

    public void setMinorMusclesWorked(String minorMusclesWorked) {
        this.minorMusclesWorked = minorMusclesWorked;
    }

    public String getMinorMusclesWorked() {
        return minorMusclesWorked;
    }

    public void setRatePerceivedEffort(int ratePerceivedEffort) {
        this.ratePerceivedEffort = ratePerceivedEffort;
    }

    public int getRatePerceivedEffort() {
        return ratePerceivedEffort;
    }
}
