package estruturaRepetitiva;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a coordenada X: ");
        int x = sc.nextInt();
        System.out.print("Digite a coordenada Y: ");
        int y = sc.nextInt();

        while(x != 0 || y != 0){

            if (x > 0 && y > 0) {
                System.out.println("PRIMEIRO");
            } else if(x > 0 && y < 0){
                System.out.println("QUARTO");
            } else if(x < 0 && y < 0){
                System.out.println("TERCEIRO");
            } else if(x < 0 && y > 0){
                System.out.println("SEGUNDO");
            }

            System.out.print("Digite a coordenada X: ");
            x = sc.nextInt();
            System.out.print("Digite a coordenada Y: ");
            y = sc.nextInt();
        }

        sc.close();
    }
}
