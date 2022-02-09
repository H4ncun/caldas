package com.gft.exercicio2;

public class Main {

    public static void main(String[] args) {

        Empregados e = new Empregados("Luiz","Gonçalves",2000);
        System.out.println(e.salarioAnual());
        e.aumentaSalario();
        System.out.println(e.salarioAnual());
    }
}
