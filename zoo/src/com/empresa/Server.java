package com.empresa;

import com.empresa.entities.Funcionario;
import com.empresa.entities.Proprio;
import com.empresa.entities.Terceirizado;
import java.util.Locale;
import java.util.Scanner;
public class Server {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String nomes = "";
        String pagamentos = "";
        String total = "";
        int cont = N;

        for(int i = 1; i<=N; i++){

            System.out.println("Proprio:(p) Terceirizado:(t) ");
            String x = sc.next();

            if(x.equals("p")){

                String nome = sc.next();
                int horasTrab = sc.nextInt();
                double valorHora = sc.nextDouble();
                Funcionario p = new Proprio(nome, horasTrab, valorHora);

               /* nomes = "Nomes: " + nome +"; " + nomes + "Pagamentos: " + p.pagamento() +"; " + pagamentos;
                pagamentos = p.pagamento() +"; " + pagamentos;*/

                total = " Funcionario " + cont + " = " + nome + "   " + p.pagamento() + total;
                cont = cont - 1;

            }else if(x.equals("t")) {

                String nome = sc.next();
                int horasTrab = sc.nextInt();
                double valorHora = sc.nextDouble();
                Funcionario t = new Terceirizado(nome, horasTrab, valorHora);
                t.setDespesasAdc(sc.nextDouble());

                nomes = nome + "; " + nomes;
                pagamentos = t.pagamento() + "; " + pagamentos;


            }

        }

        System.out.println(total);

        System.out.println("Nomes: " + nomes);
        System.out.println("Pagamentos: " + pagamentos);


        sc.close();




    }



}