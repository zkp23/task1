package ru.geekbrains.task8;

public class Wall extends Barrier {

    private final int heigth;

    public Wall(String name, int heigth) {
        super(name);

        this.heigth = heigth;
    }

    public int getHeigth() {
        return heigth;
    }

    @Override
    protected boolean moving(Actions actions) {
        System.out.println("Стена " + super.getName() + "высота: " + this.heigth);

        actions.jump();

        if (getHeigth() <= actions.getJumpHeight()) {
            System.out.println("успешный прыжок");

            return true;
        } else {
            System.out.println("неудачный прыжок");

            return false;
        }
    }
}
