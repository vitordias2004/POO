package br.inatel.cdg.jogo.habilidades;
import br.inatel.cdg.jogo.tipo.Grama;

public class MagicalLeaf extends Habilidade {
    public MagicalLeaf() {
        super("Magical Leaf", 60, 100, 20);
        this.tipo = new Grama();
    }
}
