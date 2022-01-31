package com.company.util;

import com.company.entity.Car;

import java.util.Comparator;

public class ComparatorEngine implements Comparator<Car> {


    @Override
    public int compare(Car o1, Car o2) {
        if (o1.getPowerEngine() > o2.getPowerEngine()) {
            return 1;
        }
        if (o1.getPowerEngine() < o2.getPowerEngine()) {
            return -1;
        }
        return 0;
    }
}
