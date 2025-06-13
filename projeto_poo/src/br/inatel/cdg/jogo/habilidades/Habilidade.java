package br.inatel.cdg.jogo.habilidades;

import br.inatel.cdg.jogo.tipo.Tipo;

public abstract class Habilidade {

    protected String nome;
    protected Tipo tipo;
    protected int dano;
    protected int acc;
    protected int num_usos;
    protected int max_usos;

    public Habilidade(String nome, int dano, int acc, int max_usos) {
        this.nome = nome;
        this.dano = dano;
        this.acc = acc;
        this.num_usos = max_usos;
        this.max_usos = max_usos;
    }


    public String getNome() {
        return nome;
    }

    public int getDano() {
        return dano;
    }

    public int getAcc() { return acc;}

    public Tipo getTipo() { return tipo;}

    public void usarHabilidade(){
        if(num_usos > 0){
            num_usos--;
        }else{
            System.out.println("Essa habilidade nao pode ser usada novamente");
        }
    }
}
