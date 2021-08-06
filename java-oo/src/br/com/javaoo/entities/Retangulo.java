package br.com.javaoo.entities;

public class Retangulo {

    private double altura;
    private double largura;

    public void setAltura(double altura){

        this.altura = altura;
    }

    public void setLargura(double largura){

        this.largura = largura;
    }

    public void area(){

       double area = largura * altura;
        System.out.println("Area = " + area);
    }
    public void perimetro(){
        double perimetro = 2*altura + 2*largura;
        System.out.println("Perimeter = " +  perimetro);
    }

    public void diagonal(){

        double diagonal = Math.sqrt(Math.pow(altura, 2) + Math.pow(largura, 2));
        System.out.println("Diagonal = " + diagonal);
    } 



}
