package application;

import entities.funcionario;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        funcionario func = new funcionario();

        System.out.print("Nome: ");
        func.nome = sc.nextLine();
        System.out.print("Salario bruto: ");
        func.salarioBruto = sc.nextDouble();
        System.out.print("Imposto: ");
        func.imposto = sc.nextDouble();

        System.out.printf("Funcionario: %s, R$%.2f\n", func.nome, func.salarioAbatido());
        System.out.print("Qual a porcentagem de aumento salarial? ");
        double porcentagem = sc.nextDouble();

        System.out.printf("Dados atualizados: %s, R$%.2f\n", func.nome, func.novoSalario(porcentagem));
    }
}
