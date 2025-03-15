package entities;

import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;

public class Registro <T extends Comparable<T>>{

    private Set<T> itens;

    public Registro() {
        this.itens = new TreeSet<>();
    }

    public void adicionar(T item){
        itens.add(item);
    }

    public void remover(T item){
        itens.remove(item);
    }

    public Object maior() {
        if (itens.isEmpty()) {
            throw new NoSuchElementException("O conjunto está vazio.");
        }

        Object maior = null;

        for (Object item : itens) {
            if (maior == null) {
                maior = item;
            } else {
                if (item instanceof String) {
                    if (item.toString().length() > maior.toString().length()) {
                        maior = item;
                    }
                } else if (item instanceof Number) {
                    if (((Number) item).doubleValue() > ((Number) maior).doubleValue()) {
                        maior = item;
                    }
                }
            }
        }
        return maior;
    }

    public T menor(){
        return ((TreeSet<T>) itens).first();
    }


}
