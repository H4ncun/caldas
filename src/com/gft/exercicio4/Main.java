package com.gft.exercicio4;

public class Main {

    public static void main(String[] args) {

        String destinatario = "Luiz";

        MensagemAniversario ma = new MensagemAniversario("Luiz");
        MensagemNatal mn = new MensagemNatal("Luiz");
        MensagemDiaDosNamorados mdn = new MensagemDiaDosNamorados("Luiz");

        CartaoMensagem[] cm = new CartaoMensagem[]{
                ma, mn, mdn
        };

        for(int i =0; i< cm.length;i++){

            System.out.println(cm[i].toString());
        }
    }
}