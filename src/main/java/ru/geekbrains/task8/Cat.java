package ru.geekbrains.task8;

public class Cat implements Actions{
    private String name;
    private int runDistance;
    private int jumpHeight;

    public Cat(String name, int distance, int jumpHeight) {
        this.name = name;
        this.runDistance = distance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void run() {
        System.out.println("Кот  " + this.name + " бежит " + this.getRunDistance());
    }

    @Override
    public void jump() {
        System.out.println("Кот  " + this.name + " прыгает " + this.getJumpHeight());
    }

    @Override
    public int getRunDistance() {
        return this.runDistance;
    }

    @Override
    public int getJumpHeight() {
        return this.jumpHeight;
    }
}
