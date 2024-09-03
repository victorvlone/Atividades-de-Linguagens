package Aplicacao;

import Entidades.funcionarios;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        funcionarios funcionarios;
        List<funcionarios> list = new ArrayList<>();
        int verificacao = 0;

        int retorno = 0;

        System.out.print("Quantos funcionarios serão registrados? ");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.printf("\nFuncionario #%d\n", i+1);
            System.out.print("ID: ");
            Integer id = sc.nextInt();

            for (funcionarios lista : list){
               while(lista.getId().equals(id)){
                   System.out.print("ID indisponivel, tente outro: ");
                   id = sc.nextInt();
               }
            }
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Salario: ");
            Double salario = sc.nextDouble();

            funcionarios = new funcionarios(id, nome, salario);
            list.add(funcionarios);
        }

        System.out.print("\nDigite o ID do funcionario que tera aumento: ");
        Integer idDigitado = sc.nextInt();

        for(funcionarios lista : list){
            if (lista.getId().equals(idDigitado)){
                verificacao = 1;
                System.out.print("Digite a % de aumento: ");
                Integer aumento = sc.nextInt();

                Double novoSalario = lista.salariocomAumento(aumento);
                lista.setSalario(novoSalario);
                break;
            }
        }

        if (verificacao == 0){
            System.out.println("ID não encontrado!\n");
        }

        System.out.println("Lista de funcionarios: ");
        for (funcionarios lista: list){
            System.out.println(lista);
        }

    }
}
