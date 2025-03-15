import java.io.*;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do arquivo que será copiado: ");
        String origem = sc.nextLine();
        System.out.println("Digite o nome do novo arquivo: ");
        String copia = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(origem));
             BufferedWriter bw = new BufferedWriter(new FileWriter(copia))) {

            String linha;

            while ((linha = br.readLine()) != null) {
                bw.write(linha);
                bw.newLine();
            }

            System.out.println("Arquivo copiado com sucesso!");

        } catch (IOException e) {
            System.out.println("ERRO ao copiar o arquivo: " + e.getMessage());
        }

        sc.close();
    }
}