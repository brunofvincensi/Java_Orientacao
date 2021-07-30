package br.com.javaoo.semoo;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaCirculo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        double pi, raio, area;

        pi = 3.14;
        raio = sc.nextDouble();

        area = pi * Math.pow(raio, 2.0);

        System.out.println("Area: " + area );

        sc.close();
    }
}
