package Parciales.Parcial1_Practicaa.Clases;


import Parciales.Parcial1_Practicaa.Interfaces.Contract;

import java.util.Random;

public class Athlete extends Person implements Contract {
    private int age;
    private double height;
    private double weight;

    public Athlete(String name, int dni, int age, double height, double weight) {
        super(name, dni);
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    //Metodos

    @Override
    public double calculateBMI(){
        return weight/ Math.pow(height, 2);
    }
    @Override
    public boolean isExtraWeight(double bmi){
        return bmi > 25;
    }
    @Override
    public double takePulses(){
        Random random = new Random();
        return (random.nextDouble(70 + 1) + 60);
    }

}

