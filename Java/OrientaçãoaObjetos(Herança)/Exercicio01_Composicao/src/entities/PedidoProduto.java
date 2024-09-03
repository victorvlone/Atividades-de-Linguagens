package entities;

public class PedidoProduto {

    private Integer quantidade;
    private Produto produto;

    public PedidoProduto(Produto produto, Integer quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Double subTotal(){
        return produto.getPreco() * quantidade;
    }

}
