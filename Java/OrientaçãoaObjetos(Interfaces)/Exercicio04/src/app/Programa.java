package app;

import entities.Carro;
import entities.Moto;
import entities.VeiculoTerrestre;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        VeiculoTerrestre veiculoTerrestre = null;

        System.out.print("Digite 1 para carro ou 2 para moto: ");
        int resposta = sc.nextInt();
        sc.nextLine();

        System.out.print("\nMarca: ");
        String marca = sc.nextLine();
        System.out.print("Modelo: ");
        String modelo = sc.nextLine();
        System.out.print("Ano: ");
        int ano = sc.nextInt();
        sc.nextLine();

        switch (resposta){

            case 1:
                System.out.print("Digite o número de portas: ");
                int portas = sc.nextInt();
                veiculoTerrestre = new Carro(marca, modelo, ano, portas);
                break;

            case 2:
                System.out.print("Digite o numero de cilindradas: ");
                int cilindradas = sc.nextInt();
                veiculoTerrestre = new Moto(marca, modelo, ano, cilindradas);
                break;

            default:
                System.out.print("\nVocê não escolheu nem carro e nem moto!");
                break;

        }

        if(veiculoTerrestre != null){
            System.out.println(veiculoTerrestre.exibirDetalhes());
        }

        sc.close();
    }
}
