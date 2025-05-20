package org.example;

import java.math.BigInteger;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BigInteger fact = BigInteger.valueOf(1);
        System.out.print("Введите число : ");

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if (num >= 1) {
            for (int i = 1; i <= num; i++) {

                fact = fact.multiply(BigInteger.valueOf(i)); //используется для вычисления умножения двух BigInteger
            }
        }

            System.out.print( "Факториал числа  равен: " + fact);
            in.close();
    }
}