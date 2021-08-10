package com.empresa.entities;

public abstract class Funcionario {
    private String nome;
    private int horasTrab;
    private double valorHora;
    private double despesasAdc;


    public Funcionario(){

    }

    public Funcionario(String nome,  int horasTrab, double valorHora){

        this.nome = nome;
        this.horasTrab = horasTrab;
        this.valorHora = valorHora;

    }

    public String getNome() {
        return nome;
    }

    public double getDespesasAdc() {
        return despesasAdc;
    }

    public void setDespesasAdc(double despesasAdc) {
        this.despesasAdc = despesasAdc;
    }

    public int getHorasTrab() {
        return horasTrab;
    }



    public double getValorHora() {
        return valorHora;
    }



    public abstract double pagamento();








}
