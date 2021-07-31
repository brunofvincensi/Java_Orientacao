package br.com.javaoo.semoo;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaProduto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        String nome = sc.nextLine();

        double preco = sc.nextDouble();

        int quantidade = sc.nextInt();

        double valorTotal = quantidade * preco;



        System.out.println(nome + " " + preco + " " + quantidade + " " + valorTotal);



        int entrada = sc.nextInt();
        quantidade = entrada + quantidade;
        valorTotal = quantidade * preco;

        System.out.println(nome + " " + preco + " " + quantidade + " " + valorTotal);



        int saida = sc.nextInt();
        quantidade = quantidade - saida;
        valorTotal = quantidade * preco;

        System.out.println(nome + " " + preco + " " + quantidade + " " + valorTotal);



        sc.close();
    }
}
