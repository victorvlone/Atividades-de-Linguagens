package entities;

public class Carro extends VeiculoTerrestre implements Veiculo{

    private Integer numPortas;

    public Carro(String marca, String modelo, Integer ano, Integer numPortas) {
        super(marca, modelo, ano);
        this.numPortas = numPortas;
    }

    @Override
    public String exibirDetalhes(){
        StringBuilder sb = new StringBuilder();
        sb.append(getMarca() + " ");
        sb.append(getModelo());
        sb.append(" (" + getAno() + ") ");
        sb.append("com " + numPortas + " portas");
        sb.append(acelerar());
        sb.append(frear());

        return sb.toString();
    }

    @Override
    public String acelerar() {
        return "\nO carro está acelerando!";
    }

    @Override
    public String frear() {
        return "\nO carro está freando!";
    }
}
