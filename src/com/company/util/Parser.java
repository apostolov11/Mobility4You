package com.company.util;

import com.company.entity.Car;
import com.company.entity.ElectricCar;
import com.company.entity.GasCar;
import com.company.entity.HybridCar;

public class Parser {

    public static Car getObjectFromRow(String row) {
/*        if (row.startsWith("ELECTRIC_CAR")) {
            createElCar(row);
        }
        if (row.startsWith("GAS_CAR")) {
            createGasCar(row);
        }
        if (row.startsWith("HYBRID_CAR")) {
            createHybridCar(row);
        }*/

// with switch

        int index = row.indexOf(" ");
        String keyWord = row.substring(0, index);

        switch (keyWord) {
            case "ELECTRIC_CAR":
                return
                        createElCar(row);

            case "GAS_CAR":
                return
                        createGasCar(row);

            case "HYBRID_CAR":
                return
                        createHybdridCar(row);

            default:
                System.out.println("No car type is recognize...");
                return null;
        }
    }

    private static ElectricCar createElCar(String row) {
        String[] parts = row.split(",\\s+");
        String brand = (parts[0].split("\\s+"))[1];
        String model = parts[1];
        int power = Integer.parseInt(parts[2].replace("KW", ""));
        int capacity = Integer.parseInt(parts[3].replace("Ah", ""));
        int price = Integer.parseInt(parts[4].replace(" euro", ""));

        return new ElectricCar(brand, model, power, capacity, price);
    }

    private static GasCar createGasCar(String row) {
        String[] parts = row.split(",\\s+");
        String brand = (parts[0].split("\\s+"))[1];
        String model = parts[1];
        float engineDisplacement = Float.parseFloat(parts[2].replace("L", ""));
        int power = Integer.parseInt(parts[3].replace("KW", ""));
        int price = Integer.parseInt(parts[4].replace(" euro", ""));

        return new GasCar(brand,model,engineDisplacement,power,price);
    }

    private static HybridCar createHybdridCar (String row) {
        String[] parts = row.split(",\\s+");
        String brand = (parts[0].split("\\s+"))[1];
        String model = parts[1];
        float engineDisplacement = Float.parseFloat(parts[2].replace("L", ""));
        int power = Integer.parseInt(parts[3].replace("KW", ""));
        int capacity = Integer.parseInt(parts[4].replace("Ah", ""));
        int price = Integer.parseInt(parts[5].replace(" euro", ""));

        return new HybridCar(brand,model,engineDisplacement,power,capacity,price);
    }
}
