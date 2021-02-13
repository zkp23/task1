package ru.geekbrains.task6;

public class Cat extends Animal {

    protected Cat(int nRunDistance,int nSwimDistance) {
        super(nRunDistance, nSwimDistance);
    }
    @Override
    public void swim() {
        System.out.println("Кот не умеет плавать!!!" );
    }
}
