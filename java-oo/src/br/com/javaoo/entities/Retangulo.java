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

    public double area(){

       return largura * altura;

    }
    public double perimetro(){
        return 2*altura + 2*largura;

    }

    public double diagonal(){

        return Math.sqrt(Math.pow(altura, 2) + Math.pow(largura, 2));

    }



}
