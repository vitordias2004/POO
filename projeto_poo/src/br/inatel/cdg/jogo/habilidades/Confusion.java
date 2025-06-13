package br.inatel.cdg.jogo.habilidades;
import br.inatel.cdg.jogo.tipo.Psiquico;
public class Confusion extends Habilidade {
    public Confusion() {
        super("Confusion", 50,100,25);
        this.tipo = new Psiquico();
    }
}
