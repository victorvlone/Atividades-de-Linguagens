package entities;

public class Circulo implements Forma{

    private Double raio;

    public Circulo(Double raio) {
        this.raio = raio;
    }

    @Override
    public Double calcularArea() {
        return Math.PI * (raio*raio);
    }

    @Override
    public Double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}
