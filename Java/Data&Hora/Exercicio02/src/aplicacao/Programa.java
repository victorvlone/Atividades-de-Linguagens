package aplicacao;

import entities.Agenda;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Agenda> lista = new ArrayList<>();
        int resposta;

        do {

            System.out.print("Qual o seu compromisso? ");
            String comp = sc.nextLine();
            System.out.print("Dia: ");
            Integer dia = sc.nextInt();
            System.out.print("Mês: ");
            Integer mes = sc.nextInt();
            System.out.print("Ano: ");
            Integer ano = sc.nextInt();

            LocalDate data = LocalDate.of(ano, mes, dia);

            System.out.print("Hora: ");
            int hora = sc.nextInt();
            System.out.print("minutos: ");
            int minutos = sc.nextInt();

            LocalTime horario = LocalTime.of(hora, minutos);

            for (Agenda agenda : lista){
                while (agenda.getHora() == horario){
                    System.out.println("\nVocê ja tem um comprimisso marcado nesse horario, tente outro.");
                    System.out.print("Hora: ");
                    hora = sc.nextInt();
                    System.out.print("minutos: ");
                    minutos = sc.nextInt();

                    horario = LocalTime.of(hora, minutos);
                }
            }

            Agenda agenda = new Agenda(comp, data, horario);

            lista.add(agenda);

            System.out.println("\nDeseja adicionar mais um compromisso?");
            System.out.println("1 - sim");
            System.out.println("2 - não");
            resposta = sc.nextInt();
            sc.nextLine();

        }while(resposta != 2);

        for (Agenda agenda : lista)
            System.out.println(agenda);
    }
}
