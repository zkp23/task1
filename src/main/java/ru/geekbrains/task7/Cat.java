package ru.geekbrains.task7;

public class Cat {

    private String name;
    private int appetite;

    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;

    }

    public void eat(Plate plate) {
        satiety = plate.decreaseFood(appetite);
    }

    @Override
    public String toString() {
        return "Cat{name='" + name + '\'' + ", appetite=" + appetite + ", satiety=" + satiety +'}';
    }

}
