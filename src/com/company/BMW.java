package com.company;

public class BMW extends Sedan{
    private int maxSpeed;
    private int maxDistance;

    public BMW(int volume, int year,Options options,Color color, boolean spoiler, int maxSpeed, int maxDistance) {
        super(volume, year, options,color,  spoiler);
        this.maxSpeed = maxSpeed;
        this.maxDistance = maxDistance;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void information(){
        super.information(getHaveSpoiler());
    }
}
