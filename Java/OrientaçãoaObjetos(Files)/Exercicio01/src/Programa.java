import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o caminho do arquivo: ");
        String path = sc.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String linha;
            int quantidade = 0;

            while ((linha = br.readLine()) != null) {
                quantidade++; // Conta as linhas
            }
            System.out.print("\nQuantidade de linhas: " + quantidade);
        } catch (FileNotFoundException e){
            System.out.println("Erro: arquivo não encontrado!");
        } catch (IOException e) {
        System.out.println("Erro de I/O ao ler o arquivo!");
        }
    }
}
