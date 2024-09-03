package entities;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Agenda {

    private String compromisso;
    private LocalDate data;
    private LocalTime hora;

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Agenda(String compromisso, LocalDate data, LocalTime hora) {
        this.compromisso = compromisso;
        this.data = data;
        this.hora = hora;
    }

    public String getCompromisso() {
        return compromisso;
    }

    public void setCompromisso(String compromisso) {
        this.compromisso = compromisso;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String toString(){
        return "\nCompromisso: " + getCompromisso() + "\nData: " + getData().format(fmt) + "\nHorario: " + getHora();
    }

}
