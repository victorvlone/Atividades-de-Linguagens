package estruturaCondicional;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
   
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        int N = sc.nextInt();
        
        if (N >= 0){
            System.out.println("Numero positivo");
        } else{
            System.out.println("Numero negativo");
        }     
        
        sc.close();
    }
}