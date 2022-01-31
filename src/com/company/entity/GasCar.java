package com.company.entity;

public class GasCar extends Car {

    private float engineDisplacement;
    private static final String KEYWORD = "GAS_CAR";

    public GasCar(String brand, String model,float engineDisplacement, int powerEngine, int price) {
        super(brand, model, powerEngine, price);
        this.engineDisplacement = engineDisplacement;
    }

    public float getEngineDisplacement() {
        return engineDisplacement;
    }

    public void setEngineDisplacement(float engineDisplacement) {
        this.engineDisplacement = engineDisplacement;
    }

    public String toString() {
        String middleWord = this.engineDisplacement + "L" + ", " + this.getPowerEngine() + "KW";
        return super.printBaseCar(KEYWORD, middleWord);
    }
}
