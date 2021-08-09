package com.zoo.entities;

public class Gato extends Animal{
    public Gato() {
    }

    public Gato(String nome, String especie, int idade) {
        super(nome, especie, idade);
    }

    @Override
    public boolean isAdulto(){

        return super.getIdade() >= 12;
    }
}
