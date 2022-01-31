package com.company.gui;

import com.company.Catalogue.Catalogue;

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

        loadBtn.addActionListener(new LoadAction());
        printBtn.addActionListener(new PrintAction());

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
}
