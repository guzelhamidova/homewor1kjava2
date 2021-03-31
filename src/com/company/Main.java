package com.company;

public class Main {

    public static void main(String[] args) {
        Options options = new Options(2, 4);
        Sedan objectA = new Sedan(3,2015,options,Color.BLACK,true);
        BMW objectB = new BMW(5,2020,new Options(4,4),Color.RED,false,300,500);
        BMW objectC = new BMW(4,2021,new Options(2,4),Color.WHITE,true,250,700);
        objectA.information(objectA.getHaveSpoiler());
        objectB.information(objectB.getHaveSpoiler(), options.getNumberOfDoors());
        objectC.information(options.getNumberOfDoors());
    }

}
/*
 В главном классе (Main) Создать объект класса 2-го уровня (objectA)
  и 2 объекта класса 3-го уровня (objectB, objectC), также распечатать все свойства объектов и
  вызвать перегруженные методы через каждый из экземпляров ваших объектов.

 */