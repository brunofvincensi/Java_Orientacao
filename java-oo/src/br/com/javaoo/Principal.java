package br.com.javaoo;
import br.com.javaoo.comoo.Circulo;
import br.com.javaoo.comoo.Triangulo;
import java.util.Locale;
import java.util.Scanner;

public class Principal {          /*
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangulo x = new Triangulo();

        System.out.println("Entre com os valores de area do primeiro triangulo");

         x.lado1 = sc.nextDouble();
         x.lado2 = sc.nextDouble();
         x.lado3 = sc.nextDouble();
         x.calculaArea();


         Triangulo y = new Triangulo();

        System.out.println("Entre com os valores de area do segundo triangulo");
        y.lado1 = sc.nextDouble();
        y.lado2 = sc.nextDouble();
        y.lado3 = sc.nextDouble();

        y.calculaArea();

        sc.close();


    }
    */

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        Circulo x = new Circulo();


        System.out.println("Entre com os valores de area do primeiro circulo");
        x.raio = sc.nextDouble();
        x.calculoArea();

        Circulo y = new Circulo();

        System.out.println("Entre com os valores de area do segundo circulo");

        y.raio = sc.nextDouble();
        y.calculoArea();


        sc.close();

    }
}


