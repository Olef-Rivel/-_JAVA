package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Array array1 = new Array();
        array1.create(new int[]{1, 4, 3});

        Array array2 = new Array();
        array2.create(new int[]{4, 9, 12});

        System.out.println("Первый массив:");
        array1.print();

        System.out.println("Второй массив:");
        array2.print();

        Array additionResult = array1.performOperation(array2, "add");
        System.out.println("Результат сложения:");
        additionResult.print();

        Array subtractionResult = array1.performOperation(array2, "subtract");
        System.out.println("Результат вычитания:");
        subtractionResult.print();

        Array multiplicationResult = array1.performOperation(array2, "multiply");
        System.out.println("Результат умножения:");
        multiplicationResult.print();
    }

}
