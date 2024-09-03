package entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProdutoUsado extends Produto{

    private LocalDate datadeFabricacao;

    public ProdutoUsado(String nome, Double preco, LocalDate datadeFabricacao) {
        super(nome, preco);
        this.datadeFabricacao = datadeFabricacao;
    }

    @Override
    public String etiquetadePreco(){
        StringBuilder sb = new StringBuilder();
        sb.append(nome);
        sb.append("(USADO), R$");
        sb.append(String.format("%.2f", preco));
        sb.append("(Data de fabricação: ");
        sb.append(datadeFabricacao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ")");

        return sb.toString();
    }
}
