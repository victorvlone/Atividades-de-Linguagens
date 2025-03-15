package app;

import entities.Registro;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Registro<Integer> numeros = new Registro<>();
        Registro<String> nomes = new Registro<>();

        for (int i = 0; i < 3; i++) {
            System.out.printf("Digite o %d numero: ", i+1);
            int N = sc.nextInt();

            numeros.adicionar(N);
        }
        sc.nextLine();
        for (int i = 0; i < 3; i++) {
            System.out.printf("Digite o %d nome: ", i+1);
            String nome = sc.nextLine();

            nomes.adicionar(nome);
        }

        System.out.print("\nMaior número: " + numeros.maior());
        System.out.print("\nMenor número: " + numeros.menor());

        System.out.print("\nMaior nome: " + nomes.maior());
        System.out.print("\nMenor nome: " + nomes.menor());
    }
}
