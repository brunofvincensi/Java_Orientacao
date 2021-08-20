package br.com.conexaobanco.model.entity;

// Classe do padrao de projeto JAVABEAN
public class Animal {

    // propriedades ou atributos
    private String nome;
    private String especie;
    protected int idade;
    protected String sexo;

    //CONSTRUTOR DEFAULT
    public Animal() {
    }

    //CONSTRUTOR CUSTOMIZADO QUE INICIALIZA OS ATRIBUTOS
    public Animal(String nome, String especie, int idade, String sexo) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.sexo = sexo;
    }

    // METODOS ACESSORES
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", especie='" + especie + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
