package br.com.javaoo;

import br.com.javaoo.entities.Employee;

import java.util.Scanner;

public class Principal2 {

    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    Employee a = new Employee();

    a.setNome(sc.nextLine());

    a.setNota1(sc.nextDouble());

    a.setNota2(sc.nextDouble());

    a.setNota3(sc.nextDouble());



    a.notaFinal();








}}
