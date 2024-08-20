package estruturaRepetitiva;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int gasolina = 0, alcool = 0, diesel = 0;

        System.out.println("1. Alcool");
        System.out.println("2. Gasolina");
        System.out.println("3. Diesel");
        System.out.println("4. Sair");
        System.out.print("Digite um codigo: ");
        int codigo = sc.nextInt();

        while (codigo != 4){
            if (codigo == 1){
                alcool = alcool + 1;
            } else if(codigo == 2){
                gasolina = gasolina + 1;
            } else if(codigo == 3){
                diesel = diesel + 1;
            } else{
                System.out.println("Codigo invalido!");
            }

            System.out.print("Digite mais um codigo: ");
            codigo = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}
