package br.inatel.cdg.jogo.habilidades;

import br.inatel.cdg.jogo.tipo.Grama;

public class GigaDrain extends Habilidade {
    public GigaDrain() {

        super("Giga Drain", 75, 100, 10);
        this.tipo = new Grama();

    }
}
