package com.company.gui;

import com.company.Catalogue.Catalogue;
import com.company.entity.ElectricCar;
import com.company.entity.GasCar;
import com.company.entity.HybridCar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {
    private Catalogue catalogue = new Catalogue();


    private JPanel upPanel = new JPanel();
    private JPanel midPanel = new JPanel();
    private JPanel downPanel = new JPanel();

    private JLabel brandLabel = new JLabel("Brand");
    private JLabel modelLabel = new JLabel("Model");
    private JLabel engineLabel = new JLabel("Engine Displacement");
    private JLabel powerEngineLabel = new JLabel("Power Engine");
    private JLabel capacityLabel = new JLabel("Capacity");
    private JLabel priceLabel = new JLabel("Price");

    private JTextField brandTField = new JTextField();
    private JTextField modelTField = new JTextField();
    private JTextField engineTField = new JTextField();
    private JTextField powerEngineTField = new JTextField();
    private JTextField capacityTField = new JTextField();
    private JTextField priceTField = new JTextField();
    private JTextField fileTField = new JTextField(30);

    private JButton loadBtn = new JButton("Load");
    private JButton printBtn = new JButton("print");
    private JButton addCarBtn = new JButton("Add Car");

    private String[] options = {"Electric", "Gas", "Hybrid"};
    private JComboBox<String> addCombo= new JComboBox<>(options);

    public MyFrame() {
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,600);

        this.setLayout(new GridLayout(3,1));
        this.add(upPanel);
        this.add(midPanel); // Flowlayout
        this.add(downPanel);
        setupUpPanel();
        setupMidPanel();
    } // end constructor

    private void setupUpPanel() {
        upPanel.setLayout(new GridLayout(6,2));
        upPanel.add(brandLabel);
        upPanel.add(brandTField);

        upPanel.add(modelLabel);
        upPanel.add(modelTField);

        upPanel.add(engineLabel);
        upPanel.add(engineTField);

        upPanel.add(powerEngineLabel);
        upPanel.add(powerEngineTField);

        upPanel.add(capacityLabel);
        upPanel.add(capacityTField);

        upPanel.add(priceLabel);
        upPanel.add(priceTField);
    } // end setUpPanel

    private void setupMidPanel() {
        midPanel.add(fileTField);
        midPanel.add(loadBtn);
        midPanel.add(printBtn);
        midPanel.add(addCombo);
        midPanel.add(addCarBtn);

        loadBtn.addActionListener(new LoadAction());
        printBtn.addActionListener(new PrintAction());
        addCarBtn.addActionListener(new AddCarAction());
    }
    class LoadAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String path = fileTField.getText();
            catalogue.loadFromFile(path);
        }
    }// end loadAction

    private class PrintAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            catalogue.printCatalogue();
        }
    } // end printAction
    // Стигнал съм до тука, следва privateJbutton addCar

    private class AddCarAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String brand = brandTField.getText();
            String model = modelTField.getText();
            float engine = Float.parseFloat(engineTField.getText());
            int power = Integer.parseInt(powerEngineTField.getText());
            int capacity = Integer.parseInt(capacityTField.getText());
            int price = Integer.parseInt(priceTField.getText());

            switch (addCombo.getSelectedIndex()) {
                case 0:	catalogue.addCar(new ElectricCar(brand, model, power, capacity, price));
                    break;
                case 1:	catalogue.addCar(new GasCar(brand, model, engine, power, price));
                    break;
                case 2:	catalogue.addCar(new HybridCar(brand, model, engine, power, capacity, price));
                    break;
            }//end switch
            clearFields();
        }

        private void clearFields() {
            brandTField.setText("");
            modelTField.setText("");
            engineTField.setText("");
            powerEngineTField.setText("");
            capacityTField.setText("");
            priceTField.setText("");
        }//end clearFields
        }
    }

