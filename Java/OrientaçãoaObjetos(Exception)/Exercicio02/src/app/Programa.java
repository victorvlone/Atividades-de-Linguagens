package app;

import java.util.Scanner;
import entities.Conversao;
import exceptions.ConvertException;

public class Programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        String numero = sc.nextLine();
        Conversao conversao = new Conversao(numero);

        try{
            System.out.println("\nCaractere convertidos para numeros inteiros: " + conversao.valor());
        }
        catch (ConvertException e){
            System.out.println(e.getMessage());
        }
    }
}
