package ru.geekbrains.task6;

public class AnimalApp {
    public static void main(String[] args) {
        Animal cat1 = new Cat(200,0);
        cat1.run();
        cat1.swim();
        Animal dog1 = new Dog(500,10);
        dog1.swim();
    }
}
