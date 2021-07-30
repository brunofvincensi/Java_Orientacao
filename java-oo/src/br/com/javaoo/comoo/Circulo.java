package br.com.javaoo.comoo;

public class Circulo {

    public double raio;

    public void calculoArea(){

        double area = Math.PI * Math.pow(raio, 2);
        System.out.println(area);

    }
}
