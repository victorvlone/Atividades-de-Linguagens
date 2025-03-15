package entities;

public class Par <T>{

    private T primeiro;
    private T segundo;

    public Par(T primeiro, T segundo) {
        this.primeiro = primeiro;
        this.segundo = segundo;
    }

    public Object getPrimeiro() {
        return primeiro;
    }

    public Object getSegundo() {
        return segundo;
    }

    public void trocar(){
        T troca = primeiro;
        primeiro = segundo;
        segundo = troca;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Valores trocados:\n");
        sb.append("Primeiro: " + primeiro);
        sb.append("\nSegundo: " + segundo);

        return sb.toString();
    }
}
