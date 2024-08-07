
import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o 1º numero: ");
        double a = sc.nextDouble();
        System.out.print("Digite o 2º numero: ");
        double b = sc.nextDouble();
        System.out.print("Digite o 3º numero: ");
        double c = sc.nextDouble();
        System.out.println();

        double triangulo = a * c / 2;
        double circulo = Math.PI * c * c;
        double trapezio = (a + b) * c / 2;
        double quadrado = b * b;
        double retangulo = a * b;

        System.out.printf("TRIANGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);

        sc.close();
    }
}
