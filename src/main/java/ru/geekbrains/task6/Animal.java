package ru.geekbrains.task6;

public abstract class Animal {
    private final int nRunDistance;
    private final int nSwimDistance;

    private String name;

    protected Animal(int nRunDistance, int nSwimDistance) {
        this.nRunDistance = nRunDistance;
        this.nSwimDistance = nSwimDistance;
    }

    public void run() {
        System.out.println("Животное пробежало " + nRunDistance + "м");
    }

    public void swim() {
        System.out.println("Животное проплыло " + nSwimDistance + "м");
    }
}

