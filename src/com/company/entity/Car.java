package com.company.entity;

public abstract class Car implements Comparable<Car> {

    private String brand;
    private String model;
    private int powerEngine;
    private int price;

    public Car(String brand, String model, int powerEngine, int price) {
        this.brand = brand;
        this.model = model;
        this.powerEngine = powerEngine;
        this.price = price;
    }

    public int compareTo (Car car) {
        if (this.powerEngine > car.powerEngine) {
            return 1;
        }
        if (this.powerEngine < car.powerEngine) {
            return -1;
        }
        return 0;
    }

    public String printBaseCar(String keyWord, String middleWord) {

        return keyWord + " " + this.brand + ", " + this.model +
                ", " + middleWord + ", " + this.price + " euro";
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPowerEngine() {
        return powerEngine;
    }

    public void setPowerEngine(int powerEngine) {
        this.powerEngine = powerEngine;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
