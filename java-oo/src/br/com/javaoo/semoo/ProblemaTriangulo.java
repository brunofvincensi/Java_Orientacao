package br.com.javaoo.semoo;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaTriangulo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Double x1, x2, x3, y1, y2, y3, p;


        x1 = scanner.nextDouble();
        x2 = scanner.nextDouble();
        x3 = scanner.nextDouble();

        System.out.println("Entre com os valores de area do segundo triangulo");
        y1 = scanner.nextDouble();
        y2 = scanner.nextDouble();
        y3 = scanner.nextDouble();


        p = (x1 + x2 + x3) / 2.0;
        double areaX = Math.sqrt(p * (p - x1) * (p - x2) * (p - x3));


        p = (y1 + y2 + y3) / 2.0;
        double areaY = Math.sqrt(p * (p - y1) * (p - y2) * (p - y3));

        System.out.printf("Area do triangulo X %.2f%n", areaX);
        System.out.printf("Area do triangulo Y %.2f%n", areaY);

        if (areaX > areaY) {
            System.out.println("X é o maior");

        } else {
            System.out.println("Y é o maior");
        }

        scanner.close();












    }
}
