package entities;

import java.util.Set;
import java.util.TreeSet;

public class ConjuntoUnico<T> {

    private Set<T> items;

    public ConjuntoUnico() {
        this.items = new TreeSet<>();
    }

    public Set<T> getItems() {
        return items;
    }

    public void adicionar(T item){
        items.add(item);
    }

    public void remover(T item){
        items.remove(item);
    }

    public void listar(){
        for (T obj: items){
            System.out.println(obj);
        }
    }
}