package application;

import entities.cliente;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Número da conta: ");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.print("Titular da conta: ");
        String nome = sc.nextLine();
        System.out.print("1º deposito (Opcional): ");
        double deposito = sc.nextDouble();

        cliente cliente;

        if (deposito != 0.0){
            cliente = new cliente(numero, nome, deposito);
        } else{
            cliente = new cliente(numero, nome);
        }

        System.out.println("\nDADOS DA CONTA");
        System.out.println(cliente);

        System.out.print("\nDigite um valor de deposito: ");
        deposito = sc.nextDouble();
        cliente.novoDeposito(deposito);

        System.out.println("\nDADOS DA CONTA ATUALIZADOS");
        System.out.println(cliente);

        System.out.print("\nDigite um valor de saque: ");
        double saque = sc.nextDouble();
        cliente.novoSaque(saque);

        System.out.println("\nDADOS DA CONTA ATUALIZADOS");
        System.out.println(cliente);

        sc.close();
    }
}
