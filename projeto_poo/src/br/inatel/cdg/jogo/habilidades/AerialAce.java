package br.inatel.cdg.jogo.habilidades;

import br.inatel.cdg.jogo.tipo.Voador;

public class AerialAce extends Habilidade {
    public AerialAce() {

        super("Aerial Ace", 60, 101, 20);
        this.tipo = new Voador();
    }
}