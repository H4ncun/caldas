package com.gft.exercicio2;

public class Empregados {

    private String nome;
    private String sobrenome;
    private float salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Empregados(String nome, String sobrenome, float salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        if(salario>0){
        this.salario = salario;}
        else { setSalario(0.0f);
        }
    }

    public float salarioAnual(){
        float s_anual = this.getSalario() * 12;
        return s_anual;
    }

    public void aumentaSalario(){
        float aumento = this.getSalario() * 1.10f;
        setSalario(aumento);
    }
}
