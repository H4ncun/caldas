package com.gft.exercicio4;

public class MensagemDiaDosNamorados extends CartaoMensagem {

    public MensagemDiaDosNamorados(String destinatario) {
        super(destinatario);
        this.destinatario= destinatario;
    }


    @Override
    public void retornarMensagem(String destinatario) {
        System.out.println(destinatario);

    }


}
