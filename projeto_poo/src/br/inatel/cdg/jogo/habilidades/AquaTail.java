package br.inatel.cdg.jogo.habilidades;
import br.inatel.cdg.jogo.tipo.Agua;
public class AquaTail extends Habilidade{
    public AquaTail() {
        super("Aqua Tail", 90, 90, 10);
        this.tipo = new Agua();
    }
}
