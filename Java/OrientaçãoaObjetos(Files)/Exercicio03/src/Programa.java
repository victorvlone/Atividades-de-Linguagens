import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos nomes serão digitados? ");
        int N = sc.nextInt();
        sc.nextLine();

        String[] nomes = new String[N];

        for (int i = 0; i < N; i++) {
            System.out.printf("Digite o %d nome: ", i+1);
            nomes[i] = sc.nextLine();
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\ftcpa\\Documents\\AtividadesLinguagens\\Java\\OrientaçãoaObjetos(Files)\\Exercicio03\\teste.txt"))){
            for (String nome : nomes){
                bw.write(nome);
                bw.newLine();
            }
        } catch (IOException e){
            System.out.println("Erro!");
        }

    }
}