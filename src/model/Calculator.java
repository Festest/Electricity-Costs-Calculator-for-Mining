package model;

import java.util.Observable;

public class Calculator extends Observable {
    private Device device;
    private ElectricityPrice electricityPrice;
    private Boolean summerTime;

    // Number of Hours peer week at that certain price point
    private int hoursHigh;
    private int hoursMedium;
    private int hoursLow;

    // Values
    private int total;
    private int high;
    private int medium;
    private int low;

    // Constructor
    public Calculator() {
        this.device = new Device();
        this.electricityPrice = new ElectricityPrice();
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

        update();
    }

    // Methods
    public void calculate() {
        this.high = device.getOffWattage() * electricityPrice.getHigh() * hoursHigh * 4;
        this.medium = device.getOnWattage() * electricityPrice.getMedium() * hoursMedium * 4;
        this.low = device.getOnWattage() * electricityPrice.getLow() * hoursLow * 4;
        this.total = high + medium + low;
        update();
    }

    private void update() {
        notifyObservers();
        setChanged();
    }
}
