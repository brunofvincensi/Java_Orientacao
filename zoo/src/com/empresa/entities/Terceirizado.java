package com.empresa.entities;

public class Terceirizado extends Funcionario{
    public Terceirizado() {
    }


    public Terceirizado(String nome, int horasTrab, double valorHora) {
        super(nome, horasTrab, valorHora);
    }


    @Override
    public double pagamento() {
        return (getValorHora() * getHorasTrab()) + (getDespesasAdc() * 1.1);
    }

}
