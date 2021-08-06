package br.com.javaoo;


import br.com.javaoo.entities.Product;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        Product p = new Product();

        System.out.println("Enter product data: ");

        System.out.println("Name: ");
        p.setName(sc.nextLine());
        System.out.println("Price: ");
        p.setPrice(sc.nextDouble());
        System.out.println("Quantity: ");
        p.addProduct(sc.nextInt());

        System.out.println("Product data: " + p.getName() + " $ " + p.getPrice() + " " + p.getQuantity() + " units, "
                +  "Total: $" + p.totalValueInStock());


        System.out.println("Enter the number of products to be added in stock: ");
        p.addProduct(sc.nextInt());


        System.out.println("Updated data: " + p.getName() + " $ " + p.getPrice() + " " + p.getQuantity() + " units, "
                +  "Total: $" + p.totalValueInStock());

        System.out.println("Enter the number of products to be removed from stock: ");
        p.removeProduct(sc.nextInt());

        System.out.println("Updated data: " + p.getName() + " $ " + p.getPrice() + " " + p.getQuantity() + " units, "
                +  "Total: $" + p.totalValueInStock());


sc.close();
    }
}
