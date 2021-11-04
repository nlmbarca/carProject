package com.company;

public class Main {

    public static void main(String[] args) {
        Car newCar=new Car();
        newCar.name="Ferarri";
        newCar.color="blue";
        newCar.door=3;
        newCar.engineCapacity="60000cc";
        
        System.out.println(newCar.color);
    }
}
