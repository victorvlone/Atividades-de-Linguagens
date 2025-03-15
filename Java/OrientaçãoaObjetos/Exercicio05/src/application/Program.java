package application;

import entities.Conta;
import entities.ContaEmpresarial;
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

        System.out.print("Conta Empresarial (s/n)? ");
        char tipoConta = sc.next().charAt(0);

        Conta cliente;
        ContaEmpresarial contaEmpresarial= null;

        if (tipoConta == 's') {
            System.out.print("Digite o limite de empréstimo: ");
            double limiteEmprestimo = sc.nextDouble();
            contaEmpresarial = new ContaEmpresarial(numero, nome, deposito, limiteEmprestimo);
        } 

        if (deposito != 0.0) {
            cliente = new Conta(numero, nome, deposito);
        } else {
            cliente = new Conta(numero, nome);
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

        if (tipoConta == 's') {
            System.out.println("De quanto sera o emprestimo que deseja? ");
            double valor = sc.nextDouble();

            System.out.println(cliente.toString());
            System.out.println(contaEmpresarial.limite(valor));
        }

        sc.close();
    }
}
