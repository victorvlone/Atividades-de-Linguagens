package entities;

import exceptions.ConvertException;

public class Conversao {

    private String caractere;
    private Integer numero;

    public Conversao(String numero) {
        this.caractere = numero;
    }

    public int valor(){
        verificarString();
        return numero = Integer.parseInt(caractere);
    }

    public void verificarString(){
        try {
            Integer.parseInt(caractere);
        } catch (NumberFormatException e) {
            throw new ConvertException("Erro: os caracteres digitados não são números!");
        }
    }
}
