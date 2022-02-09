package com.gft.exercicio4;

public class MensagemAniversario extends CartaoMensagem {


    public MensagemAniversario(String destinatario) {
        super(destinatario);
        this.destinatario= destinatario;
    }
    @Override
    public void retornarMensagem(String destinatario) {
        System.out.println(destinatario);
    }

    @Override
    public String toString() {
        return "MensagemAniversario{" +
                "Cartão de Aniversário para:'" + destinatario + '\'' +
                '}';
    }
}
