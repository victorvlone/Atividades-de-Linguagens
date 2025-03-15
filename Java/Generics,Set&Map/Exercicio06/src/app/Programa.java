package app;

import entities.Caixa;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um objeto: ");
        String input = sc.nextLine();
        Object obj;

        try {
            obj = Integer.parseInt(input);
        } catch (NumberFormatException e1) {

            try {
                obj = Double.parseDouble(input);
            } catch (NumberFormatException e2) {
                obj = input;
            }
        }

        Caixa<Object> caixa = new Caixa<>(obj);
        caixa.verificarTipo();
    }
}