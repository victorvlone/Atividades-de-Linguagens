package entidades;

public class PessoaJuridica extends Contribuintes{

    private Integer ndeFuncionarios;

    public PessoaJuridica(String nome, Double rendaAnual, Integer ndeFuncionarios) {
        super(nome, rendaAnual);
        this.ndeFuncionarios = ndeFuncionarios;
    }

    @Override
    public double calculodeImpostos() {
        if (ndeFuncionarios > 10){
            return rendaAnual * 0.14;
        } else{
            return rendaAnual * 0.16;
        }
    }
}
