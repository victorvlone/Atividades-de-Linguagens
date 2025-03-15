package entities;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Numeros<T extends Number & Comparable<T>> {

    private Set<T> numeros;

    public Numeros() {
        this.numeros = new TreeSet<>();
    }

    public void adicionar(T numero){
        numeros.add(numero);
    }
    public void remover(T numero){
        numeros.remove(numero);
    }

    public Set<T> filtrarMaiorQue(T numero){
        return numeros.stream()
            .filter(n -> n.compareTo(numero) > 0)
            .collect(Collectors.toSet());
    }
}
