package app;

import entities.Numeros;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Numeros<Integer> numeros = new Numeros<>();

        for (int i = 0; i < 3; i++) {
            System.out.printf("Digite o %d numero: ", i+1);
            int N = sc.nextInt();

            numeros.adicionar(N);
        }

        System.out.print("\nDigite um numero para comparação: ");
        int comp = sc.nextInt();
        System.out.println("Números maiores que " + comp + ": " + numeros.filtrarMaiorQue(comp));
    }
}
