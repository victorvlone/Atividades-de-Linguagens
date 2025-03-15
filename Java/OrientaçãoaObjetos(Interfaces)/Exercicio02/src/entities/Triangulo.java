package entities;

public class Triangulo implements Forma{

    private Double base;
    private Double altura;

    public Triangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public Double calcularArea() {
        return base * altura / 2;
    }

    @Override
    public Double calcularPerimetro() {
        return base + altura + altura;
    }
}
