package estruturaRepetitiva;

import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int in = 0, out = 0;

        System.out.print("Quantos numeros serão digitados? ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.print("Digite um numero: ");
            int x = sc.nextInt();

            if (x <= 20 && x >= 10){
                in = in + 1;
            } else{
                out = out + 1;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}
