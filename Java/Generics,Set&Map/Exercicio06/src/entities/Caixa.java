package entities;

public class Caixa <T>{

    private T item;

    public Caixa(T item) {
        this.item = item;
    }

    public void verificarTipo() {
        if (item instanceof String) {
            System.out.println("O tipo é String.");
        } else if (item instanceof Integer) {
            System.out.println("O tipo é Integer.");
        } else if (item instanceof Double) {
            System.out.println("O tipo é Double.");
        } else {
            System.out.println("Tipo desconhecido.");
        }
    }

}
