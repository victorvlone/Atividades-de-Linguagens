package entities;

public class estudante {

    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double notaFinal(){
        return nota1 + nota2 + nota3;
    }
    public String resultado(){
        if (notaFinal() >= 60){
            return "APROVADO!";
        } else{
            return "REPROVADO! FALTAM " + (60 - notaFinal()) + " PONTOS";
        }
    }

}
