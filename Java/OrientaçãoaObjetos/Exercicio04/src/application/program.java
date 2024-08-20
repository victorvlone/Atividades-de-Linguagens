package application;

import util.calculo;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o preço do dolar? ");
        double dolar = sc.nextDouble();
        System.out.print("Quantos dolares serão comprados? ");
        double compra = sc.nextDouble();

        System.out.printf("\nValor a ser pago em reais: %.2f\n", calculo.valoraSerPago(dolar, compra));
    }
}
