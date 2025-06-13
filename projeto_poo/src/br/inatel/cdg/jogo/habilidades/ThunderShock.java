package br.inatel.cdg.jogo.habilidades;

import br.inatel.cdg.jogo.tipo.Eletrico;
import br.inatel.cdg.jogo.tipo.Tipo;

public class ThunderShock extends Habilidade {
    public ThunderShock() {
        super("thunder shock", 40, 100, 30);
        this.tipo = new Eletrico();
    }
}
