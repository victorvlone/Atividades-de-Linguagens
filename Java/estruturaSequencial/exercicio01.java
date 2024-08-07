
import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o 1º numero: ");
        int n1 = sc.nextInt();
        System.out.print("Digite o 2º numero: ");
        int n2 = sc.nextInt();

        int soma = n1 + n2;

        System.out.printf("Soma dos valores: %d", soma);



        sc.close();
    }
}
