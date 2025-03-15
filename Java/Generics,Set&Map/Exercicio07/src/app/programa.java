package app;

import entities.Nomes;

import java.util.Scanner;

public class programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Nomes nomes = new Nomes();

        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o %dº nome: ", i+1);
            String nome = sc.nextLine();
            nomes.adicionar(nome);
        }
        System.out.println("\nTodos os nomes sem repetição: ");
        nomes.listar();
    }
}
