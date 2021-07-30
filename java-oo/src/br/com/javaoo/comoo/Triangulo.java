package br.com.javaoo.comoo;

public class Triangulo {
    public double lado1;
    public double lado2;
    public double lado3;

    public void calculaArea(){

        double p = (lado1 + lado2 + lado3) / 2.0;
        double areaX = Math.sqrt(p * (p - lado1) * (p - lado2) * (p - lado3));
        System.out.printf("Area do triangulo X %.2f%n", areaX);
    }
}
