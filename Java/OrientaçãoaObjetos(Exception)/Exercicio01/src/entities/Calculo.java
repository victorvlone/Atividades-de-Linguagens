package entities;

import exceptions.CalcException;

public class Calculo {

    private Integer numerador;
    private Integer denominador;

    public Calculo(Integer numerador, Integer denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Double divisao(){
        validCalc();
        return (double) numerador / denominador;
    }

    public void validCalc(){
        if (denominador == 0){
            throw new CalcException("Erro: Não é possível dividir por zero.");
        }
    }

}
