package com.gft.exercicio3;

public class Main {

    public static void main(String[] args) {

        Datas d = new Datas(9,3,1997);
        System.out.println(d._str_());
        d.avancarData();
        System.out.println(d._str_());
    }
}