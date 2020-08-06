package model;

public class Device {
    private int offWattage;
    private int onWattage;

    // Constructor
    public Device() {
        this.offWattage = 0;
        this.onWattage = 0;
    }

    // Setters & Getters
    public void setOffWattage(int offWattage) {
        this.offWattage = offWattage;
    }

    public void setOnWattage(int onWattage) {
        this.onWattage = onWattage;
    }

    public int getOffWattage() {
        return offWattage;
    }

    public int getOnWattage() {
        return onWattage;
    }
}
