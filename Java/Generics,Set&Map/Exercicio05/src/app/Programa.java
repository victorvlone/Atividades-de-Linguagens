package app;

import entities.CaixaNumerica;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CaixaNumerica<Integer> caixa = new CaixaNumerica<>();

        System.out.println("Digite 3 números inteiros para somar:");

        for (int i = 0; i < 3; i++) {
            System.out.printf("Número %d: ", i + 1);
            int numero = sc.nextInt();
            caixa.somar(numero);
        }

        System.out.printf("A soma total é: %.2f%n", caixa.getSoma());
        sc.close();
    }
}
