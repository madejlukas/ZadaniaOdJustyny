package com.company;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner liczba = new Scanner(System.in);
        System.out.println("Podaj 1 liczbę:");
        int liczba1 = liczba.nextInt();
        System.out.println("Podaj 2 liczbę:");
        int liczba2 = liczba.nextInt();
        int liczba3 = liczba1 + liczba2;

        System.out.println("Wynik dodawania = " + liczba3);
    }
}
