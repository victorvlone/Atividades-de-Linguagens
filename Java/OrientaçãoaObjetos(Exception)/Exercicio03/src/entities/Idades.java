package entities;

import exceptions.IdadeException;

public class Idades {

    private Integer idade;

    public Idades(Integer idade) {
        this.idade = idade;
    }

    public String toString(){
        verificarIdade();
        StringBuilder sb = new StringBuilder();
        sb.append("\nIdade registrada: ");
        sb.append(idade);
        sb.append(" anos");

        return sb.toString();
    }

    public void verificarIdade(){
        if (idade < 0 || idade > 150){
            throw new IdadeException("Erro: Idade inválida. Digite um número entre 0 e 150.");
        }
    }
}
