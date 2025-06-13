package br.inatel.cdg.jogo.habilidades;

import br.inatel.cdg.jogo.tipo.Normal;

public class Tackle extends Habilidade{
    public Tackle() {
        super("tackle", 40, 100, 35);
        this.tipo = new Normal();
    }

}
