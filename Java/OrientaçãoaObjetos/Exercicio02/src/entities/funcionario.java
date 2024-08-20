package entities;

public class funcionario {

    public String nome;
    public double salarioBruto;
    public double imposto;

    public double salarioAbatido(){
        return salarioBruto - imposto;
    }
    public double novoSalario(double porcentagem){
        return salarioBruto / 100 * porcentagem + salarioAbatido();
    }

}
