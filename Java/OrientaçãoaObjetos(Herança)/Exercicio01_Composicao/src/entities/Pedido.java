package entities;

import entities.enums.OrderStatus;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private static DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private LocalDateTime momentodoPedido;
    private OrderStatus status;
    private Cliente cliente;
    private List<PedidoProduto> items = new ArrayList<>();

    public Pedido(LocalDateTime momentodoPedido, OrderStatus status, Cliente cliente) {
        this.momentodoPedido = momentodoPedido;
        this.status = status;
        this.cliente = cliente;
    }

    public LocalDateTime getMomentodoPedido() {
        return momentodoPedido;
    }

    public void setMomentodoPedido(LocalDateTime momentodoPedido) {
        this.momentodoPedido = momentodoPedido;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<PedidoProduto> getItems() {
        return items;
    }

    public void addItem(PedidoProduto item){
        items.add(item);
    }
    public void removeItem(PedidoProduto item){
        items.remove(item);
    }

    public double total(){
        double total = 0;
        for (PedidoProduto item : items){
            total += item.subTotal();
        }
        return total;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
            sb.append("\nMomento do pedido: ");
            sb.append(momentodoPedido.format(formato) + "\n");
            sb.append("Status do pedido: ");
            sb.append(status + "\n");
            sb.append("Cliente: ");
            sb.append(cliente.getNome());
            sb.append("(" + cliente.getDatadeNascimento() + ")");
            sb.append(" - " + cliente.getEmail());
            sb.append("\n\nLista de items: ");
            for (PedidoProduto list : items){
                sb.append(list.getProduto().getNome() + ", ");
                sb.append(list.getProduto().getPreco() + ", ");
                sb.append("quantidade: ");
                sb.append(list.getQuantidade() + ", R$");
                sb.append(list.subTotal() + "\n");
            }
            sb.append("TOTAL: R$");
            sb.append(String.format(".2f" + total() + "\n"));
        return sb.toString();
    }
}

