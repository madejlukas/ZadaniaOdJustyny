package com.company;

import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner liczba = new Scanner(System.in);

        int a1, a2;

        System.out.println("Podaj pierwszą liczbę:");
        a1 = liczba.nextInt();
        char znak;
        System.out.println("Podaj znak:");
        znak = liczba.next().charAt(0);
        if(znak == '+' ) {
            System.out.println("Podaj drugą liczbę:");
            a2 = liczba.nextInt();
            System.out.println(a1 + a2);
        }else if (znak == '-'){
            System.out.println("Podaj drugą liczbę:");
            a2 = liczba.nextInt();
            System.out.println(a1 - a2);
        }else if (znak == '*') {
            System.out.println("Podaj drugą liczbę:");
            a2 = liczba.nextInt();
            System.out.println(a1 * a2);
        }else if (znak == '/'){
            System.out.println("Podaj drugą liczbę:");
            a2 = liczba.nextInt();
            System.out.println(a1 / a2);
        }
    }
}
