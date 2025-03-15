package entities;

public class CaixaNumerica<T extends Number> {

    private double soma;

    public CaixaNumerica() {
        this.soma = 0.0;
    }


    public void somar(T valor) {
        soma += valor.doubleValue();
    }


    public double getSoma() {
        return soma;
    }
}
