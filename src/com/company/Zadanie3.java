package com.company;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę");
        int liczba1 = user.nextInt();
        System.out.println("Podaj drugą liczbę");
        int liczba2 = user.nextInt();

        int wynik = liczba1 * liczba2;

        System.out.println("Wynik mnożenia = " + wynik);
    }
}
