import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        Instant instanteAtual = Instant.now();

        LocalDateTime dataAtual = LocalDateTime.now();
        LocalDateTime portugal = LocalDateTime.ofInstant(instanteAtual, ZoneId.of("Portugal"));
        LocalDateTime russia = LocalDateTime.ofInstant(instanteAtual, ZoneId.of("Europe/Moscow"));
        LocalDateTime china = LocalDateTime.ofInstant(instanteAtual, ZoneId.of("Asia/Shanghai"));

        System.out.println("\nData e hora no Brasil: " + dataAtual.format(fmt));
        System.out.println("Data e hora em Portugal: " + portugal.format(fmt));
        System.out.println("Data e hora na Russia: " + russia.format(fmt));
        System.out.println("Data e hora na China: " + china.format(fmt));
    }
}
