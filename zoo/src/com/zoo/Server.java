package com.zoo;

import com.zoo.entities.Animal;
import com.zoo.entities.Cachorro;
import com.zoo.entities.Gato;

import java.util.Scanner;

public class Server {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     Animal cat = new Gato();


     cat.setNome("Jojo todinho");
     cat.setEspecie("Gato vira lata");
     cat.setIdade(12);


     cat.emitiSom();
        System.out.println("Olá, seu animal é um " + cat.getEspecie() + ", o nome dele é " + cat.getNome()
                + " e tem " + cat.getIdade() + " ano(s)");


     if(cat.isAdulto()){
         System.out.println("É adulto");
     }else{
         System.out.println("É filhote");
     }


     System.out.println("Insira o nome");
     String nome = sc.next();

        System.out.println("Insira a especie");
        String especie = sc.next();

        System.out.println("Insira a idade");
       int idade = sc.nextInt();

Animal dog = new Cachorro(nome, especie, idade);

        if(dog.isAdulto()){
            System.out.println("É adulto");
        }else{
            System.out.println("É filhote");
        }

    }



}
