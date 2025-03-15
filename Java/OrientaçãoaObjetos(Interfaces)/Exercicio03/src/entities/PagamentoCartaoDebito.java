package entities;

public class PagamentoCartaoDebito implements Pagamento{

    @Override
    public void processarPagamento(double valor) {
        System.out.printf("Pagamento de R$%.2f processado no cartão de debito!", valor);
    }
}
