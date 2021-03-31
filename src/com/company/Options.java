package com.company;

public class Options {
    private int numberOfDoors;
    private int numberOfWheels;

    public Options(int numberOfDoors, int numberOfWheels) {
        this.numberOfDoors = numberOfDoors;
        this.numberOfWheels = numberOfWheels;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }
}
