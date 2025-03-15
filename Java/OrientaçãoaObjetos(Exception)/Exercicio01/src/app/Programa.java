package app;

import entities.Calculo;
import exceptions.CalcException;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numerador: ");
        int numerador = sc.nextInt();
        System.out.print("Digite o denominador: ");
        int denominador = sc.nextInt();

        Calculo calculo = new Calculo(numerador, denominador);

        try{
            System.out.printf("\nResultado: %.1f", calculo.divisao());
        }
        catch (CalcException e){
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
