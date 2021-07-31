package br.com.javaoo;

import br.com.javaoo.entities.Product;

public class Principal {
    public static void main(String[] args) {


        Product eletrodomestico = new Product();

        eletrodomestico.setName("Geladeira");
        eletrodomestico.setPrice(1.200);
        eletrodomestico.setQuantity(2);

        System.out.println(eletrodomestico.getName());
        System.out.println(eletrodomestico.getPrice());
        System.out.println(eletrodomestico.getQuantity());


        Product mesa = new Product();

        mesa.setName("Mesa de Jantar");
        mesa.setPrice(800);
        mesa.setQuantity(10);

        System.out.println(mesa.getName());
        System.out.println(mesa.getPrice());
        System.out.println(mesa.getQuantity());






    }
}
