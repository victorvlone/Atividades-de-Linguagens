import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.print("Digite a data e o horario do seu proximo compromisso(dd/MM/yyyy HH:mm): ");
        String dataHorario = sc.nextLine();

        LocalDateTime dataDigitada = LocalDateTime.parse(dataHorario, fmt);
        LocalDateTime horarioAtual = LocalDateTime.now();

        System.out.println("\nData fornecida: " + dataDigitada.format(fmt));
        System.out.println("Data atual: " + horarioAtual.format(fmt));

        Duration duracao = Duration.between(horarioAtual, dataDigitada);

        long dias = duracao.toDays();
        long horas = duracao.minusDays(dias).toHours();
        long minutos = duracao.minusDays(dias).minusHours(horas).toMinutes();
        long segundos = duracao.minusDays(dias).minusHours(horas).minusMinutes(minutos).toSeconds();

        System.out.println("\nFaltam: " + dias + " dias, " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos." );

        sc.close();
        }
    }
