package br.inatel.cdg.jogo.habilidades;

import br.inatel.cdg.jogo.tipo.Eletrico;

public class ZapCannon extends  Habilidade{
    public ZapCannon() {
        super("zap cannon", 120, 50, 5);
        this.tipo = new Eletrico();
    }
}
