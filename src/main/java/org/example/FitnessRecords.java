package org.example;

import java.util.HashMap;

public class FitnessRecords {
    private HashMap<Integer, Integer> benchPressMax = new HashMap<>();
    private HashMap<Integer, Integer> backSquatMax = new HashMap<>();
    private HashMap<Integer, Integer> deadLiftMax = new HashMap<>();

    public int getBackSquatMax(int reps) {
        return backSquatMax.get(reps);
    }

    public void setBackSquatMax(int reps, int weight){
        backSquatMax.put(reps, weight);
    }

    public int getBenchPressMax(int reps){
        return benchPressMax.get(reps);
    }

    public void setBenchPressMax(int reps, int weight) {
        benchPressMax.put(reps, weight);
    }

    public int getDeadLiftMax(int reps){
        return deadLiftMax.get(reps);
    }

    public void setDeadLiftMax(int reps, int weight) {
        deadLiftMax.put(reps, weight);
    }

    public int myTotal(){
        int benchPress1RM = this.getBenchPressMax(1);
        int backSquat1RM = this.getBackSquatMax(1);
        int deadLift1RM = this.getDeadLiftMax(1);
        return benchPress1RM + backSquat1RM + deadLift1RM;
    }

    public int myTotal(int reps){
        int benchPressMax = this.getBenchPressMax(reps);
        int backSquatMax = this.getBackSquatMax(reps);
        int deadLiftMax = this.getDeadLiftMax(reps);
        return benchPressMax + backSquatMax + deadLiftMax;
    }
}
