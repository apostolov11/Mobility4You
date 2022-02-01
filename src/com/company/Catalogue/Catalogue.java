package com.company.Catalogue;

import com.company.entity.Car;
import com.company.util.FileOperations;
import com.company.util.Parser;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Catalogue {

    // filtering and saving in the Arraylist
    private ArrayList<Car> list = new ArrayList<>();

    public void loadFromFile(String path) {
        ArrayList<String> row = FileOperations.readFileByRow(path);

        for (int i = 0; i < row.size(); i++) {
            Car car = Parser.getObjectFromRow(row.get(i));
            if (car != null) {
                list.add(car);
            } else {
                System.out.println(" No car type is recognize at row: " + i);
            }
        } // end for
        System.out.println("Objects loaded from file: " + list.size());
    } // end loadFromFIle

    public void addCar (Car car) {
        list.add(car);
    }

    public  void printCatalogue() {
        for(Car car : list) {
            System.out.println(car);
        }
    }

    public void sortByBrand() {
        Comparator<Car> byBrand =(Car b1 , Car b2) -> b1.getBrand().compareTo(b2.getBrand());
        list.sort(byBrand);

    }

    public void sortByCarType() {
        Comparator<Car> carType = (Car c1, Car c2) -> c1.getClass().getSimpleName().compareTo(c2.getClass().getSimpleName());
        list.sort(carType);
    }

    public ArrayList<Car> getList() {
        return list;
    }
}
