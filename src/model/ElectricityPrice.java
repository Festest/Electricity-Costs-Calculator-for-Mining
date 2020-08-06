package model;

public class ElectricityPrice {
    private int high;
    private int medium;
    private int low;

    // Constructor
    public ElectricityPrice() {
        this.high = 0;
        this.medium = 0;
        this.low = 0;
    }

    // Setters & Getters
    public void setHigh(int high) {
        this.high = high;
    }

    public void setLow(int low) {
        this.low = low;
    }

    public void setMedium(int medium) {
        this.medium = medium;
    }

    public int getHigh() {
        return high;
    }

    public int getLow() {
        return low;
    }

    public int getMedium() {
        return medium;
    }
}
