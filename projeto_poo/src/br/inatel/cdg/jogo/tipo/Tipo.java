package br.inatel.cdg.jogo.tipo;

public abstract class Tipo {
    protected String nome;

    public Tipo(String nome) {
        this.nome = nome;
    }

    public abstract double calcDanoTipo(Tipo ataque);

    public String getNome() { return nome;}
}
