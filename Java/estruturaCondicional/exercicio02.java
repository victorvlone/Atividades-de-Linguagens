package estruturaCondicional;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        int N = sc.nextInt();
        
        if (N % 2  == 0){
            System.out.println("PAR");
        } else{
            System.out.println("IMPAR");
        }   
        
        sc.close();
    }
}
    
