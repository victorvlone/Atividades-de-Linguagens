package entities;

import java.util.Set;
import java.util.TreeSet;

public class Nomes {

    private Set<String> nome;

    public Nomes() {
        this.nome = new TreeSet<>();
    }

    public void adicionar(String name){
        nome.add(name);
    }

    public void remover(String name){
        nome.remove(name);
    }

    public void listar(){
        for (String names: nome){
            System.out.println(names);
        }
    }
}
