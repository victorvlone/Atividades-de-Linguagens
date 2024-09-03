package entidades;

public class PessoaFisica extends Contribuintes{

    private Double saude;

    public PessoaFisica(String nome, Double rendaAnual, Double saude) {
        super(nome, rendaAnual);
        this.saude = saude;
    }

    @Override
    public double calculodeImpostos() {
        if (rendaAnual < 20000.00){
            return (rendaAnual * 0.15) - (saude * 0.50);
        } else{
            return  (rendaAnual * 0.25) - (saude * 0.50);
        }
    }
}
