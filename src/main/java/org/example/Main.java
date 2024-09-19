package org.example;

//import org.example.FitnessRecords; // Do not need because it is in the same directory
    // as Main I think

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FitnessRecords myRecord = new FitnessRecords();
        myRecord.setBackSquatMax(1, 315);
        myRecord.setBackSquatMax(3, 275);
        myRecord.setBackSquatMax(5, 275);
        myRecord.setBackSquatMax(8, 245);

        myRecord.setBenchPressMax(1, 265);
        myRecord.setBenchPressMax(3, 245);
        myRecord.setBenchPressMax(5, 225);
        myRecord.setDeadLiftMax(1, 405);
        myRecord.setDeadLiftMax(3, 365);
        myRecord.setDeadLiftMax(5, 335);
        System.out.println(myRecord.myTotal());
        System.out.println(myRecord.myTotal(3));
        System.out.println(myRecord.myTotal(5));
        }
    }
