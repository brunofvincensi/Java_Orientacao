package br.com.javaoo.entities;

public class Product {


    private String name;
    private double price;
    private int quantity;
    private String color;


    public Product(){
        System.out.println("Novo objeto construido");

    }

    //metodos acessores
    //GETTERS and SETTERS

    public void setName(String nome){
        this.name = nome;
    }

    public String getName(){
        return name;
    }


    public void setPrice(double preco){
        this.price = preco;
    }
    public double getPrice(){
        return price;
    }


   /* public void setQuantity(int quantidade){

        this.quantity = quantidade;
    }
    */

    public int getQuantity()
    {
        return quantity;
    }

    public void setColor(String cor){
        this.color = cor;
    }
    public String getColor(){
        return color;
    }


    public double totalValueInStock(){

        return price * quantity;
    }



    public void addProduct(int quantity){

        if(quantity < 0){

            return;
        }
        this.quantity += quantity;

    }

    public void removeProduct(int quantity){

        if(quantity > this.quantity){
            return;

        }
        this.quantity -= quantity;

    }




}

