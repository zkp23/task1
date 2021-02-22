package ru.geekbrains.task8;

public class Road extends Barrier {
    private int length;

    public Road(String name, int length) {
        super(name);

        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    protected boolean moving(Actions actions) {
        System.out.println("Дорога " + super.getName() + " длина: " + this.length);

        actions.run();

        if (getLength() <= actions.getRunDistance()) {
            System.out.println("пробежка завершена");

            return true;
        } else {
            System.out.println("неудачная попытка");

            return false;
        }
    }
}
