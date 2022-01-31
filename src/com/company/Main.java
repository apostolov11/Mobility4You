package com.company;

import com.company.Catalogue.Catalogue;
import com.company.gui.MyFrame;
import com.company.util.FileOperations;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
/*        ArrayList<String> list = FileOperations.readFileByRow("D:\\ПУ_JAVA\\mobility.txt");
        Catalogue catalogue = new Catalogue();
        catalogue.loadFromFile("D:\\ПУ_JAVA\\mobility.txt");
        catalogue.sortByBrand();
        catalogue.sortByCarType();
        catalogue.printCatalogue();
        FileOperations.writeCatalogueToFile(catalogue,"D:\\ПУ_JAVA\\output.txt");*/

        MyFrame myFrame = new MyFrame();
    }
}
