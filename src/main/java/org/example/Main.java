package org.example;


public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 500; i++) {
            if (i % 5 == 0){
                System.out.println("fizz");
            } else if (i % 7 == 0) {
                System.out.println("buzz");
            }
            else if ((i / 5)==0 && (i / 7) == 0)
            {
                System.out.println("fizzbuzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}