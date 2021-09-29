import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner liczba = new Scanner(System.in);
        double liczba1 = liczba.nextDouble();

        double pierwiastek;
        pierwiastek = Math.sqrt(liczba1);

        System.out.println(pierwiastek);

    }
}
