package br.inatel.cdg.jogo.habilidades;

import br.inatel.cdg.jogo.tipo.Eletrico;

public class ThunderWave extends Habilidade {
    public ThunderWave() {

        super("Thunder Wave", 0, 90, 20);
        this.tipo = new Eletrico(); // Define o tipo da habilidade como Elétrico

    }
}