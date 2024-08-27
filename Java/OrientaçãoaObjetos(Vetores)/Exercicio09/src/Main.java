import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();

        String[] nome = new String[n];
        int[] idade = new int[n];
        int maiorIdade = 0, cont = 0;

        for (int i = 0; i < n; i++) {
            System.out.printf("\nDados da %dª pessoa:\n", i+1);
            sc.nextLine();
            System.out.print("Nome: ");
            nome[i] = sc.nextLine();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (idade[i] > maiorIdade){
                cont = i;
                maiorIdade = idade[i];
            }
        }
        System.out.println("\nPESSOA MAIS VELHA: " + nome[cont]);
    }
}