package com.company.entity;

public class HybridCar extends Car{

    private float engineDisplacement;
    private int capacity;
    private static final String KEYWORD = "HYBRID_CAR";

    public HybridCar(String brand, String model,float engineDisplacement, int powerEngine,int capacity, int price) {
        super(brand, model, powerEngine, price);
        this.engineDisplacement = engineDisplacement;
        this.capacity = capacity;
    }

    public float getEngineDisplacement() {
        return engineDisplacement;
    }

    public void setEngineDisplacement(float engineDisplacement) {
        this.engineDisplacement = engineDisplacement;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String toString() {
        String middleWord = this.engineDisplacement + "L " + getPowerEngine() + "KW, " + this.capacity + "Ah";
        return super.printBaseCar(KEYWORD,middleWord);
    }
}
