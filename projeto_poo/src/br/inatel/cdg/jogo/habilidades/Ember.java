package br.inatel.cdg.jogo.habilidades;
import br.inatel.cdg.jogo.tipo.Fogo;


public class Ember extends Habilidade {
    public Ember() {
        super("Ember", 40, 100, 25);
        this.tipo = new Fogo();

    }

}
