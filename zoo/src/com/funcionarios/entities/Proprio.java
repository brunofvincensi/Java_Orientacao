package com.funcionarios.entities;

public class Proprio extends Funcionario{

    public Proprio() {
    }

    public Proprio(String nome, int horasTrab, double valorHora) {
        super(nome, horasTrab, valorHora);
    }

    @Override
    public double pagamento() {
        return getValorHora() * getHorasTrab();
    }

}
