package br.com.conexaobanco;

import br.com.conexaobanco.model.entity.Company;
import br.com.conexaobanco.model.entity.Individual;
import br.com.conexaobanco.model.entity.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Server2 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> taxPayerList = new ArrayList<>();

        int N = sc.nextInt();




        for(int i = 1; i<=N; i++){
            System.out.println("Pessoa fisica (f) / Pessoa juridica (j)");
            char x = sc.next().charAt(0);


            System.out.println("Insira o nome: ");
            String name = sc.next();
            System.out.println("Insira a renda anual: ");
            double anuallncome = sc.nextDouble();
            if(x == 'f'){
                System.out.println("Insira os gastos de saude: ");
                double healthExpenditures = sc.nextDouble();
                taxPayerList.add(new Individual(name, anuallncome, healthExpenditures ));

            }else{
                System.out.println("Insira os numeros de funcionarios: ");
                int numberOfEmployees = sc.nextInt();

                taxPayerList.add(new Company(name, anuallncome, numberOfEmployees));

            }




        }
        System.out.println("TaxPayer: ");
        for (TaxPayer taxPayer: taxPayerList
             ) {
            System.out.println(taxPayer.getName() +  "----" + taxPayer.tax());
        }

        sc.close();
    }
}
