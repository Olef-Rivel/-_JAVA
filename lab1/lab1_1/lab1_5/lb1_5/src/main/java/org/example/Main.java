package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    /* public  static boolean isPositive(int n){
        int num = 0;
        if (n > 0){
            num = 1;
        }
        return false;
    } */
    public static void main(String[] args) {

        int n =0;
        System.out.print("Введите 3 числа : ");

        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        in.close();

            if (num1 > 0) {
                n++;
            }
            if (num2 > 0) {
                n++;
            }
            if (num3 > 0) {
                n++;
            }

        System.out.print("Количество положительных чисел  " + n);



        


    }
}