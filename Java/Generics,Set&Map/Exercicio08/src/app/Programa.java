package app;

import entities.ConjuntoUnico;
import java.util.Scanner;
import java.util.Set;

public class Programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ConjuntoUnico<String> itemsString = new ConjuntoUnico<>();
        ConjuntoUnico<Integer> itemsInteger = new ConjuntoUnico<>();
        ConjuntoUnico<Double> itemsDouble = new ConjuntoUnico<>();

        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o %dº item: ", i+1);
            String item = sc.nextLine();
            try{
                int numero = Integer.parseInt(item);
                itemsInteger.adicionar(numero);
            }catch (RuntimeException e){
                try {
                    double numero = Double.parseDouble(item);
                    itemsDouble.adicionar(numero);
                } catch(RuntimeException c){
                    itemsString.adicionar(item);
                }
            }
        }

        Set<String> setUnico = itemsString.getItems();
        for (Integer num : itemsInteger.getItems()) {
            setUnico.add(num.toString());
        }

        for (Double num : itemsDouble.getItems()) {
            setUnico.add(num.toString());
        }

        System.out.println("Itens únicos combinados e como strings:");
        for (String item : setUnico) {
            System.out.println(item);
        }
    }
}
