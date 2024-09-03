package entidades;

public abstract class Contribuintes {

    protected String nome;
    protected Double rendaAnual;

    public Contribuintes(String nome, Double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    public abstract double calculodeImpostos();

    public String impostosPagos() {
        StringBuilder sb = new StringBuilder();
        sb.append(nome);
        sb.append(": R$");
        sb.append(calculodeImpostos());

        return sb.toString();
    }

}
