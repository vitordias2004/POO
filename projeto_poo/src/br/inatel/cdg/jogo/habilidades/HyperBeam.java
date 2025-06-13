package br.inatel.cdg.jogo.habilidades;

import br.inatel.cdg.jogo.tipo.Normal;

public class HyperBeam extends Habilidade {
    public HyperBeam() {

        super("Hyper Beam", 150, 90, 5);
        this.tipo = new Normal();

    }
}