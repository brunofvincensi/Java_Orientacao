package com.zoo.entities;

public abstract class Animal {

    private String nome;
    private String especie;
    private int idade;

    //Metodo Construtor
    public Animal(){

    }

    public Animal(String nome, String especie, int idade){

        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    //Metodos
    public void emitiSom(){
        System.out.println("Som do animal");

    }

    public abstract boolean isAdulto();



}
