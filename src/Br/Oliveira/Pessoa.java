package Br.Oliveira;

import java.util.List;
import java.util.Locale;

public class Pessoa {
    private String nome;
    private String genero;
    private int idade;

    public Pessoa(String nome, String genero, int idade) {
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;

    }

    public Pessoa() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public List<Pessoa>  listaGnero() {
        Pessoa pessoa1 = new Pessoa("Hygor", "M",25);
        Pessoa pessoa2 = new Pessoa("lorena", "F",25);
        Pessoa pessoa3 = new Pessoa("Elloá", "F",8);
        Pessoa pessoa4 = new Pessoa("Viviane", "F",41);
        Pessoa pessoa5 = new Pessoa("Anderson", "M",46);
        Pessoa pessoa6 = new Pessoa("Ingridy", "F",28);
        return List.of(pessoa1, pessoa2, pessoa3, pessoa4, pessoa5, pessoa6);

    }
}
