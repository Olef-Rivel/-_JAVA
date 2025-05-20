package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int n0 = 1;
        int n1 = 1;
        int n2;
        for (int i = 1; i < 15; i++){
            n2 = n0 + n1;
            n0 = n1;
            n1 = n2;
            System.out.println(n0);
        }

    }
}