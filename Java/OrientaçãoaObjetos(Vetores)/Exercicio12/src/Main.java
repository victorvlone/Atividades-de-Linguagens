import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos quartos serão alugados? ");
        int n = sc.nextInt();

        String[] nome = new String[n];
        int[] quarto = new int[n];
        String[] email = new String[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.print("\nDigite seu nome: ");
            nome[i] = sc.nextLine();
            System.out.print("Digite seu email: ");
            email[i] = sc.nextLine();
            System.out.print("Digite seu quarto: ");
            quarto[i] = sc.nextInt();

            while (quarto[i] > 9 && quarto[i] < 0){
                System.out.print("Quarto invalido! Escolha de 0 a 9: ");
                quarto[i] = sc.nextInt();
            }
        }
        System.out.println("\nQuartos alugados: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 9; j++) {
                if (quarto[i] == j){
                    System.out.printf("%d: %s, %s\n", quarto[i], nome[i], email[i]);
                }
            }
        }
    }
}