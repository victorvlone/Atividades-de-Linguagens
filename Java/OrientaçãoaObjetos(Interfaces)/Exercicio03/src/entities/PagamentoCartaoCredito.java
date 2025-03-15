package entities;

public class PagamentoCartaoCredito implements Pagamento{

    @Override
    public void processarPagamento(double valor) {
        System.out.printf("Pagamento de R$%.2f processado no cartão de credito!", valor);
    }
}
