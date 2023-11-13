package ru.rudnev.test.java;

public class Plate {
    private int maxFood;
    private int currentFood;

    public Plate(int maxFood) {
        this.maxFood = maxFood;
        //При создании тарелки указывается ее объем и она полностью заполняется едой
        this.currentFood = maxFood;
    }

    public boolean addFood(int amount) {
        if (currentFood + amount <= maxFood) {
            currentFood += amount;
            return true;
        } else {
            return false;
        }
    }

    public boolean decreaseFood(int amount){
        if (currentFood + amount <= maxFood) {
            currentFood += amount;
            return true;
        } else {
            return false;
        }
    }
}
