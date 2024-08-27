import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataAtual = LocalDate.now();

        System.out.print("Digite sua data de nascimento(dd/mm/yyyy): ");
        String nascimento = sc.nextLine();

        LocalDate nasc = LocalDate.parse(nascimento, fmt);
        Period idade = Period.between(nasc, dataAtual);

        System.out.println("\nSUA IDADE: " + idade.getYears());
    }
}
