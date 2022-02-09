package com.gft.exercicio3;

public class Datas {

    private int dia;
    private int mes;
    private int ano;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Datas(int dia, int mes, int ano) {
        if(dia<=31){
        this.dia = dia;}
        if(mes<=12){
        this.mes = mes;}
        if(ano>0){
        this.ano = ano;}
    }

    public Datas() {
    }


    public String _str_() {
        return "Datas{" + dia +"/" + mes +"/"+ ano +
                '}';
    }

    public void avancarData(){
        this.setDia(this.getDia()+1);
    }
}
