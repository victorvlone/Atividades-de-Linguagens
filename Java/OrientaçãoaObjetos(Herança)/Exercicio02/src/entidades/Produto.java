package entidades;

public class Produto {

    protected String nome;
    protected Double preco;

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String etiquetadePreco(){
        StringBuilder sb = new StringBuilder();
        sb.append(nome);
        sb.append(", R$");
        sb.append(String.format("%.2f", preco));

        return sb.toString();
    }

}
