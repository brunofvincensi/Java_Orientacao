package com.zoo.entities;

public class Cachorro extends Animal{
    public Cachorro() {
    }

    public Cachorro(String nome, String especie, int idade) {
        super(nome, especie, idade);
    }

    @Override
    public boolean isAdulto(){

        return super.getIdade() >= 24;
    }
}
