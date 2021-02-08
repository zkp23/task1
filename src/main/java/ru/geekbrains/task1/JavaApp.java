package ru.geekbrains.task1;

import javax.xml.soap.SOAPPart;

public class JavaApp {
    public static void main(String[] args) {
        byte a = 100;
        short b = 10;
        int c = 10000;
        long d = 1000000;
        float e = 5.2f;
        double f = 23423.34;
        char g = 'a';
        boolean h = true;
    }
//3.
    public static float calculate(float a,float b,float c,float d) {
        float res;
        res = a * (b + (c / d));
        return res;
    }
//4.
    public static boolean task10and20(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else{
            return false;
        }
    }
//5.
    public static void isPositiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("Число " + a + " положительное");
        } else {
            System.out.println("Число " + a + " отрицательное");
        }
    }
//6.
   public static boolean isNegative(int a) {
        return a < 0;
   }
//7.
    public static void greetings(String s){
        System.out.println("Привет,  " + s + "!");
    }

//8.
    public static void checkYear(int year) {
        if (year % 4 == 0 && year % 100 !=0 || year % 400 == 0) {
            System.out.println(year + " год высокосный");
        }
    }

}
