package estruturaCondicional;

import java.util.Scanner;

public class exercicio05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um codigo de 1 a 5: ");
        int codigo = sc.nextInt();
        System.out.print("Quantidade de compra: ");
        int quantidade = sc.nextInt();

        double valor;

        switch (codigo) {

            case 1:
                valor = 4.0;
                break;
            case 2:
                valor = 4.50;
                break;
            case 3:
                valor = 5.0;
                break;
            case 4:
                valor = 2.0;
                break;
            case 5:
                valor = 1.50;
                break;
            default:
                valor = 0;
        }

        double resultado = valor * quantidade;

        System.out.printf("Total; R$%.2f", resultado);

        sc.close();
    }
}
