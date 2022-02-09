package com.gft.exercicio1;

public class Main {

    public static void main(String[] args) {
        Fatura f = new Fatura();
        f.setPreco_uni(12.50f);
        f.setQtd_item(2);

        System.out.println( f.calculaFatura());


    }
}
