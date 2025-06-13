package br.inatel.cdg.jogo.habilidades;
import br.inatel.cdg.jogo.tipo.Fogo;

public class FireWheel extends Habilidade {
    public FireWheel() {
        super("Fire Wheel", 60, 100, 25);
        this.tipo = new Fogo();
    }

}
