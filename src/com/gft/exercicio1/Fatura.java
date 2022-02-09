package com.gft.exercicio1;

public class Fatura {

    private int num_item;
    private int desc_item;
    private int qtd_item;
    private float preco_uni;

    public int getNum_item() {
        return num_item;
    }

    public void setNum_item(int num_item) {
        this.num_item = num_item;
    }

    public int getDesc_item() {
        return desc_item;
    }

    public void setDesc_item(int desc_item) {
        this.desc_item = desc_item;
    }

    public int getQtd_item() {
        return qtd_item;
    }

    public void setQtd_item(int qtd_item) {
        this.qtd_item = qtd_item;
    }

    public float getPreco_uni() {
        return preco_uni;
    }

    public void setPreco_uni(float preco_uni) {
        this.preco_uni = preco_uni;
    }

    public Fatura() {
        setNum_item(0);
        setDesc_item(0);
        setQtd_item(0);
        setPreco_uni(0.0f);
    }

    public Fatura(int num_item, int desc_item, int qtd_item, float preco_uni) {
        this.num_item = num_item;
        this.desc_item = desc_item;
        this.qtd_item = qtd_item;
        this.preco_uni = preco_uni;
    }

    public float calculaFatura() {
        float fatura = this.qtd_item * this.preco_uni;
        return fatura;
    }
}
