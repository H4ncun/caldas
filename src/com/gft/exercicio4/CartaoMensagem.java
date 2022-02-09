package com.gft.exercicio4;

public abstract class CartaoMensagem {

    public String destinatario;

    public CartaoMensagem() {
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public CartaoMensagem(String destinatario) {
        this.destinatario = destinatario;
    }

    public void retornarMensagem(String destinatario){

    }
}
