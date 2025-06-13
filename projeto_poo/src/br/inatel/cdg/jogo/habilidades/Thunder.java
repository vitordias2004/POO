package br.inatel.cdg.jogo.habilidades;

import br.inatel.cdg.jogo.tipo.Eletrico;

public class Thunder extends Habilidade {
    public Thunder() {
        super("Thunder", 110, 70, 10);
        this.tipo = new Eletrico();
    }
}
