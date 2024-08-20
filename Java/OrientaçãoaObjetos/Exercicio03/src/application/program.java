package application;

import entities.estudante;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        estudante estudante = new estudante();

        System.out.print("Nome: ");
        estudante.nome = sc.nextLine();
        System.out.print("Digite a 1ª nota: ");
        estudante.nota1 = sc.nextDouble();

        while (estudante.nota1 > 30){
            System.out.println("1ª nota invalida! Tente novamente: ");
            estudante.nota1 = sc.nextDouble();
        }
        System.out.print("Digite a 2ª nota: ");
        estudante.nota2 = sc.nextDouble();

        while (estudante.nota2 > 35){
            System.out.println("2ª nota invalida! Tente novamente: ");
            estudante.nota2 = sc.nextDouble();
        }
        System.out.print("Digite a 3ª nota: ");
        estudante.nota3 = sc.nextDouble();

        while (estudante.nota3 > 35){
            System.out.println("3ª nota invalida! Tente novamente: ");
            estudante.nota3 = sc.nextDouble();
        }

        System.out.printf("\nNOTA FINAL: %.2f\n", estudante.notaFinal());
        System.out.printf(estudante.resultado());


    }
}
