package ru.geekbrains.task3;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static final int MAX_NUMBER = 10;
    public static final int NUMBER_ATTEMPTS = 3;

    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String repeatAnswer;

        do {
            int guessNumber = random.nextInt(MAX_NUMBER);

            for (int i =1;i <= NUMBER_ATTEMPTS; i++) {
                System.out.print("Введите число:");
                int answer = scanner.nextInt();

                if (answer > guessNumber) {
                    System.out.println("Загаданное число меньше");
                    System.out.println("Осталось" + (NUMBER_ATTEMPTS - i) + "попыток");
                } else if (answer < guessNumber) {
                    System.out.println("Загаданное число больше");
                    System.out.println("Осталось" + (NUMBER_ATTEMPTS - i) + "попыток");
                } else {
                    System.out.println("Вы угадали!");
                    break;
                }

                if (i == NUMBER_ATTEMPTS) {
                    System.out.println("Вы проиграли");
                }
            }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет:");
            repeatAnswer = scanner.next();
        } while (repeatAnswer.equals("1"));
        scanner.close();
    }

}

