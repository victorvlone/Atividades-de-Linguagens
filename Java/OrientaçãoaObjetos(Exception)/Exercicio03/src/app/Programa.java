package app;

import entities.Idades;
import exceptions.IdadeException;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        Idades idades = new Idades(idade);

        try{
            System.out.println(idades.toString());
        }
        catch (IdadeException e){
            System.out.println(e.getMessage());
        }
    }
}
