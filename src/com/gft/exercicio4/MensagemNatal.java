package com.gft.exercicio4;

public class MensagemNatal extends CartaoMensagem{

    public MensagemNatal(String destinatario) {
        super(destinatario);
        this.destinatario= destinatario;
    }
    @Override
    public void retornarMensagem(String destinatario) {
        System.out.println(destinatario);
    }

}
