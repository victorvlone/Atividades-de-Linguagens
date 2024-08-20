package entities;

public class cliente {

    private String nome;
    private int numero;
    private double deposito;

    public cliente() {
    }

    public cliente(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }

    public cliente(int numero, String nome, double deposito) {
        this.deposito = deposito;
        this.nome = nome;
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDeposito() {
        return deposito;
    }

    public double novoDeposito(double deposito){
        return this.deposito = this.deposito + deposito;
    }
    public double novoSaque(double saque){
        return this.deposito = this.deposito - (saque + 5);
    }

    public String toString(){
        return "Número: " + numero + ", Titular: " + nome + ", Balanço: R$" + String.format("%.2f", deposito);
    }

}
