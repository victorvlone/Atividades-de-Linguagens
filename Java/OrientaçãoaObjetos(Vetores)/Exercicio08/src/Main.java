import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int par = 0, soma = 0;

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        int[] vect = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();

            if (vect[i] % 2 == 0){
                par++;
                soma += vect[i];
            }
        }

        if (par > 0){
            System.out.printf("\nMEDIA DOS PARES: %.1f\n", ((double) soma / par));
        } else{
            System.out.println("\nNENHUM NUMERO PAR");
        }

    }
}