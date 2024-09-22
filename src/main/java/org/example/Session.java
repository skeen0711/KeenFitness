package org.example;


public class Session{
    private String movement;
    private int weight;
    private int reps;
    private int rpe;
    private String feelingNotes;
    private String formNotes;

    // method to check if current set is a PR
    private void checkPR(String movement, int weight, int reps, FitnessRecords records){
        int currMax;

        if (movement.equalsIgnoreCase("backsquat")){
            currMax = records.getBackSquatMax(reps);
        } else if(movement.equalsIgnoreCase("benchpress")){
            currMax = records.getBenchPressMax(reps);
        } else if (movement.equalsIgnoreCase("deadlift")){
            currMax = records.getDeadLiftMax(reps);
        } else currMax = 0;

        int nextReps = reps;
        while (weight > currMax){
            if (nextReps == 1){
                break;
            } else nextReps--;
            if (movement.equalsIgnoreCase("backsquat")){
                records.setBackSquatMax(reps, weight);
                currMax = records.getBackSquatMax(nextReps);
            } else if(movement.equalsIgnoreCase("benchpress")){
                records.setBenchPressMax(reps, weight);
                currMax = records.getBenchPressMax(nextReps);
            } else if (movement.equalsIgnoreCase("deadlift")){
                records.setDeadLiftMax(reps, weight);
                currMax = records.getDeadLiftMax(nextReps);
            }
        }
    }

    // Getters
    public String getMovement() {
        return movement;
    }
    public int getWeight() {
        return weight;
    }
    public int getReps() {
        return reps;
    }
    public int getRpe() {
        return rpe;
    }
    public String getFeelingNotes() {
        return feelingNotes;
    }
    public String getFormNotes() {
        return formNotes;
    }

    // Setters
    public void setMovement(String movementName){
        this.movement = movementName;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setReps(int reps) {
        this.reps = reps;
    }
    public void setRpe(int rpe) {
        this.rpe = rpe;
    }
    public void setFeelingNotes(String feelingNotes) {
        this.feelingNotes = feelingNotes;
    }
    public void setFormNotes(String formNotes) {
        this.formNotes = formNotes;
    }
}
