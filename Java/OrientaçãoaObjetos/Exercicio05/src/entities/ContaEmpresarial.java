package entities;

public class ContaEmpresarial extends Conta{

    private double limiteEmprestimo;

    public ContaEmpresarial(){}


    public ContaEmpresarial(int numero, String nome, double deposito, double limiteEmprestimo) {
        super(numero, nome, deposito);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public String limite(double valor) {
        StringBuilder sb = new StringBuilder();
        if (valor > limiteEmprestimo) {
            sb.append("O empréstimo não foi aceito!");
        } else {
            sb.append(String.format("Empréstimo aceito no valor de R$%.2f", valor));
        }
        return sb.toString();
    }
}
