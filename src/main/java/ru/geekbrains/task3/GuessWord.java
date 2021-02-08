package ru.geekbrains.task3;

import java.util.Random;
import java.util.Scanner;
import java.lang.StringBuilder;

public class GuessWord {
    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);
    public static String[] words = {
            "apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
            "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper",
            "pineapple", "pumpkin", "potato"
    };

    public static void main(String[] args) {
        String guessWord = words[random.nextInt(words.length)];

        while (true) {
            System.out.print("Напишите слово:");
            String userAnswer = scanner.nextLine();

            if (userAnswer.equals(guessWord)) {
                System.out.println("Угадали!");
                break;

            } else {
                StringBuilder resultStr = getPartAnswer(userAnswer, guessWord);

                System.out.println("Попробуйте еще раз");
                System.out.println(resultStr.toString());

            }
        }
        scanner.close();
    }

    private static StringBuilder getPartAnswer(String userAnswer, String guessword) {
        char[] chars = userAnswer.toCharArray();

        StringBuilder resultStr = new StringBuilder();
        for (int i = 0; i < chars.length; i++)
            if (i < guessword.length()) {
                if (chars[i] == guessword.charAt(i)) {
                    resultStr.append(chars[i]);
                } else {
                    resultStr.append("#");
                }
            }
        resultStr.append("###############");
        return resultStr;

    }
}
