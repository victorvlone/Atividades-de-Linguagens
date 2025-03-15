package entities;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class FiltrarSet<T extends Comparable<T>> {

    private Set<T> objeto;

    public FiltrarSet() {
        this.objeto = new TreeSet<>();
    }

    public void Adicionar(T item){
        objeto.add(item);
    }

    public Set<T> Predicate(){
        Set<? extends Object> list = new TreeSet<>();
        if(objeto.isEmpty()){
            throw new RuntimeException("A lista esta vazia!");
        }
        for(T lista: objeto){
            if(lista instanceof Number){
                Number numero = (Number) lista;
                list.add(numero);
            }
        }

        return list;
    }
}
