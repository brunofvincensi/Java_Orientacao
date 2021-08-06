package br.com.javaoo;

import br.com.javaoo.entities.Retangulo;

import java.util.Scanner;

public class Principal3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Retangulo r = new Retangulo();

        System.out.println("Enter rectangle width and height:");
        r.setAltura(sc.nextDouble());
        r.setLargura(sc.nextDouble());

        r.area();
        r.perimetro();
        r.diagonal();


        sc.close();
    }
}
