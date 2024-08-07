
import java.util.Locale;
import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("codigo do funcionario: ");
        int codigo = sc.nextInt();
        System.out.print("Numero de horas trabalhadas: ");
        int horasTrabalhadas = sc.nextInt();
        System.out.print("Valor por hora: ");
        double valorporHora = sc.nextDouble();

        double salario = horasTrabalhadas * valorporHora;

        System.out.printf("Salario: %.2f", salario);

        sc.close();
    }
}
