package app;

import entities.Caixa;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<Caixa> set = new HashSet<>();

        for (int i = 0; i < 3; i++) {
            System.out.printf("Digite o %dº numero: ", i+1);
            int n = sc.nextInt();
            System.out.printf("Digite o %dº nome: ", i+1);
            String nome = sc.nextLine();

            Caixa caixa = new Caixa<>(n, nome);
            set.add(caixa);
        }


    }
}
