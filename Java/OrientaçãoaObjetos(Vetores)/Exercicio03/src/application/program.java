package application;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double totalAltura = 0;

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] nome = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];

        for (int i = 0; i < nome.length; i++) {
            System.out.printf("Dados da %dª pessoa\n", i+1);
            System.out.print("Nome: ");
            nome[i] = sc.nextLine();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
            System.out.print("Altura: ");
            altura[i] = sc.nextDouble();
            sc.nextLine();

            totalAltura += altura[i];
        }

        System.out.printf("\nALTURA MEDIA: %.2f\n", totalAltura / altura.length);

        int cont = 0;
        for (int i = 0; i < idade.length; i++) {
            if (idade[i] < 16){
                cont++;
            }
        }
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", ((double)cont / n * 100));

        for (int i = 0; i < n; i++) {
            if (idade[i] < 16){
                System.out.println(nome[i]);
            }
        }
    }
}
