package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static double arithmetic_mean_1 = 0 ;
    private static double arithmetic_mean_2 = 0 ;

    public  static int getRandom(){
        return (int) (Math.random() * 5);
    }

    public static void main(String[] args) {

        int[] firstArr = new int[5];
        int[] secondArr = new int[5];

        for (int i = 0; i < firstArr.length; i++) {

            firstArr[i] = getRandom();
            arithmetic_mean_1 += (double)firstArr[i] / firstArr.length; //среднее арифметическое

        }


        for (int i = 1; i < secondArr.length; i++) {

            secondArr[i] = getRandom();
            arithmetic_mean_2 += (double)secondArr[i] / secondArr.length;

        }

        System.out.println("Первый массив  " + Arrays.toString(firstArr));
        System.out.println("Второй массив  " + Arrays.toString(secondArr));

        if (arithmetic_mean_1 > arithmetic_mean_2){
            System.out.println("Среднее арифметическое первого масиива больше. Оно равно   " + arithmetic_mean_1);
        } else if (arithmetic_mean_2> arithmetic_mean_1) {
            System.out.println("Среднее арифметическое второго масиива больше. Оно равно   " + arithmetic_mean_2);
        }
        else {
            System.out.println("Среднее арифметическое массивов равно");
        }
        System.out.println("Среднее арифметическое первого масиива   " + arithmetic_mean_1);
        System.out.println("Среднее арифметическое второго масиива   " + arithmetic_mean_2);

    }
}