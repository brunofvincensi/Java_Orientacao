package br.com.conexaobanco;


import br.com.conexaobanco.model.dao.AnimalDAO;
import br.com.conexaobanco.model.dao.PessoaDAO;

import br.com.conexaobanco.model.entity.Animal;
import br.com.conexaobanco.model.entity.Pessoa;

import java.sql.SQLException;

public class Server {



    public static void main(String[] args) throws SQLException, ClassNotFoundException {

         /*Animal a = new Animal("Jojo", "Gato", 1, "femea");

        AnimalDAO dao = new AnimalDAO();
        dao.save(a);*/
AnimalDAO daoLista = new AnimalDAO();
        System.out.println(daoLista.findAll());



       /* Pessoa x = new Pessoa("Vini", 20, "55555");

        PessoaDAO dao = new PessoaDAO();
        dao.save(x);*/
    }

}
