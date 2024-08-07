
import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Codigo do produto: ");
        int codigo01 = sc.nextInt();
        System.out.print("Número de peças: ");
        int pecas01 = sc.nextInt();
        System.out.print("Valor do produto: ");
        double valor01 = sc.nextDouble();
        System.out.println();

        System.out.print("Codigo do produto: ");
        int codigo02 = sc.nextInt();
        System.out.print("Número de peças: ");
        int pecas02 = sc.nextInt();
        System.out.print("Valor do produto: ");
        double valor02 = sc.nextDouble();
        System.out.println();

        double total = (pecas01 * valor01) + (pecas02 * valor02);

        System.out.printf("Valor a pagar: R$%.2f", total);

        sc.close();
    }
}
