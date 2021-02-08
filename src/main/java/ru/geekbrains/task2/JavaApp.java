package ru.geekbrains.task2;

public class JavaApp {
    public static void main(String[] args) {
        //changeArray();
        checkMax();
    }
//1
    public static void invertArray() {
        int[] arr = {1, 0, 1, 0, 0, 1, 0, 1};
        for (int i = 0;i <= arr.length;i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
    }
//2
    public static void fillArray(){
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + i * 2;
        }
    }
//3
    public static void changeArray() {
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <6) {
                arr[i] *=2;
            }
        }
    }
//4
    public static void fillDiagonal() {
        int[][] arr = new int[8][8];
        for (int i = 0; i < 8; i++) {
           arr[i][i] = 1;
        }
    }

//5
    public static void checkMax() {
        int[] arr = {1, 2, 3, 4, 5};
        int val = 0;
        //System.out.println(arr.length);
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] < arr[i - 1]) {
                      val = arr[i - 1];
            }
        }
        System.out.println(val);
    }
}