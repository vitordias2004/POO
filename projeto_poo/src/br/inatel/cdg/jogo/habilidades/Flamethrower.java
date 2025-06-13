package br.inatel.cdg.jogo.habilidades;

import br.inatel.cdg.jogo.tipo.Fogo;

public class Flamethrower extends Habilidade {

    public Flamethrower() {
        super("flamethrower", 90, 100, 15);
        this.tipo = new Fogo();
    }

}
