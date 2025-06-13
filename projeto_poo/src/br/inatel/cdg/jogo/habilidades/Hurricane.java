package br.inatel.cdg.jogo.habilidades;

import br.inatel.cdg.jogo.tipo.Voador;

public class Hurricane extends Habilidade {
    public Hurricane() {
        super("hurricane", 110, 70, 10);
        this.tipo = new Voador();
    }
}
