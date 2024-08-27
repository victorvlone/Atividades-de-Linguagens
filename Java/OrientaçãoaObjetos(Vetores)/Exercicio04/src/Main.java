import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int[] vect = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        int cont = 0;
        System.out.print("NUMEROS PARES: ");
        for (int i = 0; i < n; i++) {
            if (vect[i] % 2 == 0){
                System.out.printf("%d ", vect[i]);
                cont++;
            }
        }
        System.out.printf("\nQUANTIDADE DE PARES: %d", cont);
    }
}