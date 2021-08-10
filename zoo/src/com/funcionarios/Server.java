package com.funcionarios;

import com.funcionarios.entities.Funcionario;
import com.funcionarios.entities.Proprio;
import com.funcionarios.entities.Terceirizado;
import java.util.Locale;
import java.util.Scanner;
public class Server {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String ficha = "";

        for(int i = 1; i<=N; i++){

            System.out.println("Proprio:(p) Terceirizado:(t) ");
            String x = sc.next();

            if(x.equals("p")){

                String nome = sc.next();
                int horasTrab = sc.nextInt();
                double valorHora = sc.nextDouble();
                Funcionario p = new Proprio(nome, horasTrab, valorHora);

                ficha = ficha + " Funcionario " + i + " = " + nome + "   R$" + p.pagamento();


            }else if(x.equals("t")) {

                String nome = sc.next();
                int horasTrab = sc.nextInt();
                double valorHora = sc.nextDouble();
                Funcionario t = new Terceirizado(nome, horasTrab, valorHora);
                t.setDespesasAdc(sc.nextDouble());

                ficha = ficha + " Funcionario " + i + " = " + nome + "   R$" + t.pagamento();

            }

        }

        System.out.println(ficha);



        sc.close();


    }

}