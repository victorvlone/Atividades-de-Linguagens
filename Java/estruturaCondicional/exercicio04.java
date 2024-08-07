package estruturaCondicional;

import java.util.Scanner;

public class exercicio04 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a hora que começou o jogo: ");
        int inicio = sc.nextInt();
        System.out.print("Digite a hora que terminou o jogo: ");
        int fim = sc.nextInt();

        int resultado;
        if (inicio > fim){
            resultado = 24 - inicio + fim;
        } else if(fim > inicio){
            resultado = fim - inicio;
        }  else{
            resultado = 24;
        }

        System.out.printf("O JOGO DUROU %dHORA(S)", resultado);
    }
}

