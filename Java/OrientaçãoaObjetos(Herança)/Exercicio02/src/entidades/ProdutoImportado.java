package entidades;

public class ProdutoImportado extends Produto{

    private Double taxa;

    public ProdutoImportado(String nome, Double preco, Double taxa) {
        super(nome, preco);
        this.taxa = taxa;
    }

    @Override
    public String etiquetadePreco(){
        StringBuilder sb = new StringBuilder();
        sb.append(nome);
        sb.append(", R$");
        sb.append(String.format("%.2f", precoTotal()));
        sb.append("(taxa de importação: ");
        sb.append(String.format("%.2f", taxa) + ")");

        return sb.toString();
    }

    public Double precoTotal(){
        return taxa + preco;
    }

}
