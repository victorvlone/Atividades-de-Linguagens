
import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("raio do circulo: ");
        double raio = sc.nextDouble();

        double area = Math.PI * raio * raio;

        System.out.printf("Area: %.4f", area);

        sc.close();
    }
}
