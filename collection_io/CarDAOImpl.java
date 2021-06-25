package com.perscholas.java_basics.exercises.collection_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class CarDAOImpl implements CarDAO{
    @Override
    public ArrayList<Car> setCarsInformation() {
        ArrayList<Car> list = new ArrayList<>();
        try {
            String fName = "src/com/perscholas/java_basics/exercises/collection_io/cars.csv";
            File csvFile = new File(fName);
            Scanner sc = new Scanner(csvFile);
            String columnNames = sc.nextLine();
            String columnTypes = sc.nextLine();
            while(sc.hasNext()) {
                String line = sc.nextLine();
                String[] data = line.split(",");
                Car c = new Car();
                c.setName(data[0]);
                c.setMpg(parseDouble(data[1]));
                c.setCylinders(parseInt(data[2]));
                c.setDisplacement(parseDouble(data[3]));
                c.setHorsepower(parseDouble(data[4]));
                c.setWeight(parseDouble(data[5]));
                c.setAcceleration(parseDouble(data[6]));
                c.setModel(parseInt(data[7]));
                c.setOrigin(data[8]);

                list.add(c);
            }
            sc.close();
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
        return list;
    }

    @Override
    public void getCarsInformation() {
        ArrayList<Car> cars = setCarsInformation();
        for (Car c : cars){
            //System.out.println(c.toString());
            System.out.println(
                    c.getName() + " " +
                    c.getMpg() + " " +
                    c.getCylinders() + " " +
                    c.getDisplacement() + " " +
                    c.getHorsepower() + " " +
                    c.getWeight() + " " +
                    c.getAcceleration() + " " +
                    c.getModel() + " " +
                    c.getOrigin());
        }
    }
}