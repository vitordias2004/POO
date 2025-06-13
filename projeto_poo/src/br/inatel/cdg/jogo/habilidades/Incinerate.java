package br.inatel.cdg.jogo.habilidades;

import br.inatel.cdg.jogo.tipo.Fogo;


public class Incinerate extends Habilidade {
    public Incinerate() {
        super("Incinerate", 60, 100, 15);
        this.tipo = new Fogo();
    }
}
