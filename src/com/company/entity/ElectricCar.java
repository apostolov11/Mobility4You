package com.company.entity;

public class ElectricCar extends Car{

    private int capacity;
    private static final String KEYWORD = "ELECTRIC_CAR";

    public ElectricCar(String brand, String model, int powerEngine,int capacity , int price) {
        super(brand, model, powerEngine, price);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String toString (){
        String middleWord = this.getPowerEngine() + "KW" + ", " + this.capacity + "Ah";
        return  super.printBaseCar(KEYWORD,middleWord);

    }
}
