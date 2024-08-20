package util;

public class calculo {

    public static double valoraSerPago(double dolar, double compra){
        double conversao = compra * dolar;
        return conversao / 100 * 6 + conversao;
    }

}
