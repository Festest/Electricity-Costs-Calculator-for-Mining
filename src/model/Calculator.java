package model;

import java.util.Observable;

public class Calculator extends Observable {

    // Number of Hours peer week at that certain price point
    private float hoursHigh;
    private float hoursMedium;
    private float hoursLow;

    // Device Wattage in Kilowatts
    private float idleWattage;
    private float miningWattage;

    // Electricity Price
    private Boolean summerTime;
    private float high;
    private float medium;
    private float low;

    // Computed Values
    private float total;
    private float highHours;
    private float mediumHours;
    private float lowHours;

    // Constructor with defaults
    public Calculator() {
        this.idleWattage = (float) 0.04;
        this.miningWattage = (float) 0.17;
        this.high = (float) 0.2728;
        this.medium = (float) 0.1569;
        this.low = (float) 0.097;
        setSummerTime(true);
    }

    // Setters & Getters
    public void setSummerTime(Boolean summerTime) {
        this.summerTime = summerTime;
        if (this.summerTime) {
            this.hoursHigh = 15;
            this.hoursMedium = 77;
        }
        else {
            this.hoursHigh = 25;
            this.hoursMedium = 67;
        }
        this.hoursLow = 76;
    }

        /* Device Wattage */
    public void setIdleWattage(float idleWattage) {
        this.idleWattage = idleWattage / 1000; // Unit conversion
    }

    public void setMiningWattage(float miningWattage) {
        this.miningWattage = miningWattage / 1000;  // Unit conversion
    }

        /* Electricity Prices */
    public void setHigh(float high) {
        this.high = high;
    }

    public void setLow(float low) {
        this.low = low;
    }

    public void setMedium(float medium) {
        this.medium = medium;
    }

    // Methods
    public void calculate() {
        this.highHours = idleWattage * high * hoursHigh * 4;
        this.mediumHours = miningWattage * medium * hoursMedium * 4;
        this.lowHours = miningWattage * low * hoursLow * 4;
        this.total = highHours + mediumHours + lowHours;
        System.out.println(total);
    }
}
