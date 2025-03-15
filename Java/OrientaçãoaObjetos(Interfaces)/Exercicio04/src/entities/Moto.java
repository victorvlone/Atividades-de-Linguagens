package entities;

public class Moto extends VeiculoTerrestre implements Veiculo{

    private Integer cilindrada;

    public Moto(String marca, String modelo, Integer ano, Integer cilindrada) {
        super(marca, modelo, ano);
        this.cilindrada = cilindrada;
    }

    @Override
    public String exibirDetalhes(){
        StringBuilder sb = new StringBuilder();
        sb.append(getMarca() + " ");
        sb.append(getModelo());
        sb.append(" (" + getAno() + ") ");
        sb.append("com " + cilindrada + " cilindradas");
        sb.append(acelerar());
        sb.append(frear());

        return sb.toString();
    }

    @Override
    public String acelerar() {
        return "\nA moto esta acelerando!";
    }

    @Override
    public String frear() {
        return "\nA moto esta freando!";
    }
}
