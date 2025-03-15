package app;

import entities.Par;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o 1º valor: ");
        String valor1 = sc.nextLine();
        System.out.print("Digite o 2º valor: ");
        String valor2 = sc.nextLine();

        Par<String> par = new Par<>(valor1, valor2);
        par.trocar();

        System.out.println(par.toString());
    }
}
