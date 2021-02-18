package ru.geekbrains.task7;

public class Plate {
    private int foodValue;

    public Plate(int foodValue){
        this.foodValue = foodValue;
    }

    public boolean decreaseFood(int countEatenFood) {
        if (hasEnoughFood(countEatenFood)) {
            foodValue -= countEatenFood;
            return true;
        }
        return false;
    }

    private boolean hasEnoughFood(int requiredCountFood) {
        return foodValue >= requiredCountFood;
    }

    public void info() {
        System.out.println("в тарелке:" + foodValue);
    }

    public void addFood(int countFood) {
        foodValue += countFood;
    }


}
