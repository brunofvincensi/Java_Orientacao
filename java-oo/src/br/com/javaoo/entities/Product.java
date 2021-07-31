package br.com.javaoo.entities;

public class Product {


    private String name;
    private double price;
    private int quantity;


    //metodos acessores
    public void setName(String nome){

        this.name = nome;

    }

    public String getName(){

        return name;
    }



    public void setPrice(double price){

        this.price = price;

    }

    public double getPrice(){

        return price;
    }



    public void setQuantity(int quantidade){

        this.quantity = quantidade;

    }

    public int getQuantity(){

        return quantity;
    }



}
