package aplicacao;

import entidades.Produto;
import entidades.ProdutoImportado;
import entidades.ProdutoUsado;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<>();

        System.out.print("Digite o numero de produtos: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.printf("\nDados do %dº produto\n", i+1);
            System.out.print("Comum, usado ou importado(c/u/i)? ");
            String tipo = sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Preço: ");
            double preco = sc.nextDouble();

            if (tipo.equals("i")){
                System.out.print("Taxa de importação: ");
                double taxa = sc.nextDouble();

                ProdutoImportado pi = new ProdutoImportado(nome, preco, taxa);
                produtos.add(pi);
            } else if(tipo.equals("u")){
                sc.nextLine();
                System.out.print("Data de fabricação: ");
                String dataString = sc.nextLine();
                LocalDate data = LocalDate.parse(dataString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                ProdutoUsado pu = new ProdutoUsado(nome, preco, data);
                produtos.add(pu);
            } else if(tipo.equals("c")){
                Produto p = new Produto(nome, preco);
                produtos.add(p);
            }
        }
        System.out.println("\nETIQUETA DE PREÇOS:");
        for (Produto lista: produtos){
            System.out.println(lista.etiquetadePreco());
        }

        sc.close();
    }
}
