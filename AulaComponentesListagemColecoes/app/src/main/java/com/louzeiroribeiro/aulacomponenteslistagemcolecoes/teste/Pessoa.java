package com.louzeiroribeiro.aulacomponenteslistagemcolecoes.teste;

public class Pessoa {
    private String nome = "";
    private int idade = 0;

    public String getNome() {
        System.out.println("get: " + nome );
        return nome;
    }

    public void setNome(String nome) {

        System.out.println("set: " + nome );
        this.nome = nome;
    }

    public int getIdade() {

        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
