package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {



    public static void main(String[] args) {

        System.out.print("Введите n-размерность квадратной матрицы: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] sourceNumbers = new int[n][n];

        //Заполнение элементами
        for (int i = 0; i < sourceNumbers.length; i++) {
            for (int j = 0; j < sourceNumbers[i].length; j++) {
                sourceNumbers[i][j] = (int) (Math.random() * ((n + 1) - (-n))) + (-n);
            }
        }

        for (int[] sourceNumber : sourceNumbers) {
            System.out.println();
            for (int i : sourceNumber) {
                System.out.print(i + "\t");
            }
        }
        System.out.println("\n");


        //for (int i = 0; i < sourceNumbers.length; i++) {
        //            System.out.println();
        //            for (int j = 0; j < sourceNumbers[i].length; j++) {
        //                System.out.print(sourceNumbers[i][j] + "\t");
        //            }
        //        }
        //        System.out.println("\n");  //Тоже самое, что и сверху


        //  Преобразовать строки матрицы таким образом, чтобы элементы, равные
        // нулю, располагались после всех остальных.


        // Преобразуем строки
        for (int i = 0; i < sourceNumbers.length; i++) {
            List<Integer> nonZeroElements = new ArrayList<>();
            List<Integer> zeroElements = new ArrayList<>();

            // Разделяем не нулевые и нулевые элементы
            for (int j = 0; j < sourceNumbers[i].length; j++) {
                if (sourceNumbers[i][j] != 0) {
                    nonZeroElements.add(sourceNumbers[i][j]); //если не равно 0 добавыляем в список ненулевых
                } else {
                    zeroElements.add(sourceNumbers[i][j]); // в нулевые
                }
            }

            // Объединить ненулевые и нулевые элементы обратно в строку
            int index = 0;
            for (int value : nonZeroElements) {
                sourceNumbers[i][index++] = value; //добавление сначала ненулевых элем по индексу
            }
            for (int value : zeroElements) {
                sourceNumbers[i][index++] = value; //потом нулевых
            }
        }

        // Вывод матрицы
        System.out.println("\nПреобразованная матрица:");
        for (int[] sourceNumber : sourceNumbers) {
            for (int i : sourceNumber) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }

    }
}