package aplicacao;

import entidades.Contribuintes;
import entidades.PessoaFisica;
import entidades.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Contribuintes> contribuintes = new ArrayList<>();
        double total = 0;

        System.out.print("Digite o numero de contribuintes: ");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.printf("Dados do %dº contribuinte\n", i+1);

            System.out.print("Pessoa fisica ou juridica(f/j)? ");
            char resposta = sc.next().charAt(0);
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Renda anual: ");
            double rendaAnual = sc.nextDouble();

            if (resposta == 'f'){
                System.out.print("Despesas de saúde: ");
                double despesas = sc.nextDouble();

                PessoaFisica fisica = new PessoaFisica(nome, rendaAnual, despesas);
                contribuintes.add(fisica);
            } else if(resposta == 'j'){
                System.out.print("Numero de funcionarios: ");
                int ndeFuncionarios = sc.nextInt();

                PessoaJuridica juridica = new PessoaJuridica(nome, rendaAnual, ndeFuncionarios);
                contribuintes.add(juridica);
            }
        }

        System.out.println("\nIMPOSTOS PAGOS\n");
        for (Contribuintes list: contribuintes){
            System.out.println(list);

            total += list.calculodeImpostos();
        }
        System.out.printf("\nTOTAL: R$%.2f", total);
    }
}
