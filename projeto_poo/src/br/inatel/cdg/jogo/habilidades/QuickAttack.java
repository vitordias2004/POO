package br.inatel.cdg.jogo.habilidades;

import br.inatel.cdg.jogo.tipo.Normal;

public class QuickAttack extends Habilidade {
    public QuickAttack(){
        super("quick attack", 40, 100, 30);
        this.tipo = new Normal();
    }
}
