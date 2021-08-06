package br.com.javaoo.entities;

public class Employee {

   private String nome;
   private double nota1;
   private double nota2;
   private double nota3;

    public void setNome(String nome)
    { this.nome = nome;
    }


    public void setNota1(double nota1)
    { this.nota1 = nota1;
    }



    public void setNota2(double nota2)
    { this.nota2 = nota2;
    }



    public void setNota3(double nota3)
    { this.nota3 = nota3;
    }



    // -----------------------

    public void notaFinal(){
        double notaFinal =  nota1 + nota2 + nota3;

        System.out.println("Final grade = " + notaFinal);


        if(notaFinal < 60.0){
            System.out.println("Failed");
            double toPass = 60 - notaFinal;
            System.out.println("Missing " + toPass + " points");

        }
        else{
            System.out.println("Pass");

        }
    }}



