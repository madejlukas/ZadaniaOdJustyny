package com.company;

import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę");
        double liczba1 = user.nextInt();

        System.out.println("Podaj drugą liczbę");
        double liczba2 = user.nextInt();

        double wynik = liczba1 / liczba2;

        System.out.println(wynik);
    }
}
