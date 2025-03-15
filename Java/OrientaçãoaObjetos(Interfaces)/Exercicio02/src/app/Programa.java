package app;

import entities.Circulo;
import entities.Retangulo;
import entities.Triangulo;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero da forma que deseja calcular a Área e o Perimetro\n\n");
        System.out.println("1. Triangulo");
        System.out.println("2. Retangulo");
        System.out.println("3. Circulo\n");
        System.out.print("Qual deseja calcular? ");
        int resposta = sc.nextInt();

        if (resposta == 1 || resposta == 2){
            System.out.print("Digite a Base: ");
            Double base = sc.nextDouble();
            System.out.print("Digite a Altura: ");
            Double altura = sc.nextDouble();

            if (resposta == 1){
                Triangulo triangulo = new Triangulo(base, altura);

                System.out.printf("Area: %.2f\n", triangulo.calcularArea());
                System.out.printf("Perimetro: %.2f\n", triangulo.calcularPerimetro());
            } else{
                Retangulo retangulo = new Retangulo(base, altura);

                System.out.printf("Area: %.2f\n", retangulo.calcularArea());
                System.out.printf("Perimetro: %.2f\n", retangulo.calcularPerimetro());
            }
        } else if (resposta == 3){
            System.out.print("Digite o Raio do circulo: ");
            Double raio = sc.nextDouble();

            Circulo circulo = new Circulo(raio);

            System.out.printf("Area: %.2f\n", circulo.calcularArea());
            System.out.printf("Perimetro: %.2f\n", circulo.calcularPerimetro());
        }
    }
}
