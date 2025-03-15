package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contrato {

    private Integer numero;
    private LocalDate data;
    private Double totalContrato;

    List<Parcelas> listParcelas = new ArrayList<>();

    public Contrato(Integer numero, LocalDate data, Double totalContrato) {
        this.numero = numero;
        this.data = data;
        this.totalContrato = totalContrato;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Double getTotalContrato() {
        return totalContrato;
    }

    public void setTotalContrato(Double totalContrato) {
        this.totalContrato = totalContrato;
    }
}
