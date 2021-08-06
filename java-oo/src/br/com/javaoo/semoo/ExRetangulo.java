package br.com.javaoo.semoo;

import java.util.Scanner;

public class ExRetangulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rectangle width and height:");
        double altura = sc.nextDouble();
        double largura = sc.nextDouble();


        double area = altura * largura;

        double perimetro = 2+area + 2*largura;

        double diagonal = Math.sqrt(Math.pow(altura, 2) + Math.pow(largura, 2));

        System.out.println("Area = " + area);
        System.out.println("Perimeter = " +  perimetro);
        System.out.println("Diagonal = " + diagonal);









        sc.close();
    }
}
