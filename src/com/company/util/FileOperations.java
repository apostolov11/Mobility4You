package com.company.util;
import com.company.Catalogue.Catalogue;
import com.company.entity.Car;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class FileOperations {

    public static ArrayList<String> readFileByRow (String path) {

        ArrayList<String> rows = new ArrayList<>();
        try(BufferedReader reader = Files.newBufferedReader(Paths.get(path))) {

            rows = (ArrayList<String>) reader.lines().collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return rows;
    }
    public static void writeCatalogueToFile(Catalogue catalogue, String path) {

        try(BufferedWriter bw = Files.newBufferedWriter(Paths.get(path))) {
            for (Car car : catalogue.getList()){
                bw.write(car.toString());
                bw.newLine();
            }
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
