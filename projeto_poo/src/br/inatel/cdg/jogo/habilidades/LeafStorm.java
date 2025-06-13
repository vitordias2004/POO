package br.inatel.cdg.jogo.habilidades;
import br.inatel.cdg.jogo.tipo.Grama;


public class LeafStorm extends Habilidade{
    public LeafStorm() {
        super("Leaf Storm", 130, 90, 5);
        this.tipo = new Grama();
    }
}
