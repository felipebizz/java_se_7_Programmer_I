package br.com.caelum.certificacao;

class Pessoa {

    String nome;
    String sobrenome;

    Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNomeCompleto() {
        return this.nome + this.sobrenome;
    }
}
