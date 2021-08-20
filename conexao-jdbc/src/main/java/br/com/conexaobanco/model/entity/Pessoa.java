package br.com.conexaobanco.model.entity;

public class Pessoa {

    private String nome;
    private String cpf;
    private int idade;


    //CONSTRUTOR DEFAULT
    public Pessoa() {
    }

    //CONSTRUTOR CUSTOMIZADO QUE INICIALIZA OS ATRIBUTOS
    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
