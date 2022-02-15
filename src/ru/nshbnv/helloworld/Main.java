package ru.nshbnv.helloworld;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bye bye, world!");

        Scanner input = new Scanner(System.in);
        String s = input.next();

        int a = 1, b = 2;
        System.out.println(a - b);
        System.out.println(a * b);
    }
}
