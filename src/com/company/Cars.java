package com.company;

public class Cars {
    private int volume;
    private int year;
    private Options options;
    private Color color;

    public Cars(int volume, int year,Options options, Color color) {
        this.volume = volume;
        this.year = year;
        this.options = options;
        this.color = color;
    }

    public int getVolume() {
        return volume;
    }

    public int getYear() {
        return year;
    }

    public Options getOptions() {
        return options;
    }

    public Color getColor() {
        return color;
    }
}
