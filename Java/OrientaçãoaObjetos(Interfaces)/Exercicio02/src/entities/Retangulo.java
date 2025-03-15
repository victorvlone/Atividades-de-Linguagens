package entities;

public class Retangulo implements Forma {

    private Double base;
    private Double altura;

    public Retangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public Double calcularArea() {
        return base * altura;
    }

    @Override
    public Double calcularPerimetro() {
        return 2 * (base + altura);
    }
}
