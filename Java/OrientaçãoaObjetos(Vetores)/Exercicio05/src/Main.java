import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int maior = 0, posicao = 0;

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int[] vect = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (vect[i] > maior){
                maior = vect[i];
                posicao = i;
            }
        }

        System.out.printf("\nMAIOR VALOR: %d\n", maior);
        System.out.printf("POSIÇÃO DO MAIOR VALOR: %d\n", posicao);
    }
}