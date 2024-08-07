
import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o 1º número: ");
        int n1 = sc.nextInt();
        System.out.print("Digite o 2º número: ");
        int n2 = sc.nextInt();
        System.out.print("Digite o 3º número: ");
        int n3 = sc.nextInt();
        System.out.print("Digite o 4º número: ");
        int n4 = sc.nextInt();

        int diferenca = n1 * n2 - n3 * n4;

        System.out.printf("Diferença: %d", diferenca);

        sc.close();
    }
}
