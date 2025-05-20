package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите аргумент : ");
        String argument = in.nextLine();

         System.out.printf("Ваши аргументы : %s \n", argument);

         String result = "";
         for (int i=0; i<argument.length(); i++){
             result=argument.charAt(i) + result;
         }
         System.out.printf("Отзеркаленный аргумент : %s" , result);
         in.close();


    }
}