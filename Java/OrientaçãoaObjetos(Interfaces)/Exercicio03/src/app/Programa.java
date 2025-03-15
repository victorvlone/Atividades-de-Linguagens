package app;

import entities.Pagamento;
import entities.PagamentoBoleto;
import entities.PagamentoCartaoCredito;
import entities.PagamentoCartaoDebito;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o valor? ");
        double valor = sc.nextDouble();

        System.out.println("1. Cartão de Credito");
        System.out.println("2. Cartão de Debito");
        System.out.println("3. Boleto\n");
        System.out.print("Escolha a forma de pagamento: ");
        int resposta = sc.nextInt();

        Pagamento pagamento = null;

        switch (resposta){
            case 1:
                pagamento = new PagamentoCartaoCredito();
                break;
            case 2:
                pagamento = new PagamentoCartaoDebito();
                break;
            case 3:
                pagamento = new PagamentoBoleto();
                break;
        }
        if (pagamento != null){
            pagamento.processarPagamento(valor);
        }

        sc.close();
    }
}
