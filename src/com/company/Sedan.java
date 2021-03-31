package com.company;

public class Sedan extends Cars {
    private boolean isHaveSpoiler;

    public Sedan(int volume, int year, Options options, Color color, boolean spoiler) {
        super(volume, year, options, color);
        this.isHaveSpoiler = spoiler;
    }

    public boolean getHaveSpoiler() {
        return isHaveSpoiler;
    }

    public void information(boolean isHaveSpoiler) {
        System.out.println("Объем:"+getVolume()
                +"\nГод выпуска:"+getYear()+"\nКоличество дверей:"
                +getOptions().getNumberOfDoors()+"\nКоличество колес:"
                +getOptions().getNumberOfWheels()+"\nНаличие спойлера:"+getHaveSpoiler()+"\n");
    }

    public void information(int numberOfDoors) {
        System.out.println("Объем:"+getVolume()
                +"\nГод выпуска:"+getYear()+"\nКоличество дверей:"
                +getOptions().getNumberOfDoors()+"\nКоличество колес:"
                +getOptions().getNumberOfWheels()+"\nНаличие спойлера:"+getHaveSpoiler()+"\n");
    }

    public final void information(boolean isHaveSpoiler, int numberOfDoors) {
        System.out.println("Объем:"+getVolume()
                +"\nГод выпуска:"+getYear()+"\nКоличество дверей:"
                +getOptions().getNumberOfDoors()+"\nКоличество колес:"
                +getOptions().getNumberOfWheels()+"\nНаличие спойлера:"+getHaveSpoiler()+"\n");
    }
}