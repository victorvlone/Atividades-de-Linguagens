import java.util.Scanner;

public class ativvidadesenai {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero de 1 a 7: ");
        int n = sc.nextInt();

        switch (n){
            case 1:
                System.out.println("Dia da semana: Domingo");
                break;
            case 2:
                System.out.println("Dia da semana: Segunda-feira");
                break;
            case 3:
                System.out.println("Dia da semana: Terça-feira");
                break;
            case 4:
                System.out.println("Dia da semana: Quarta-feira");
                break;
            case 5:
                System.out.println("Dia da semana: Quinta-feira");
                break;
            case 6:
                System.out.println("Dia da semana: Sexta-feira");
                break;
            case 7:
                System.out.println("Dia da semana: Sabado");
                break;
        }

        sc.close();
    }
}
