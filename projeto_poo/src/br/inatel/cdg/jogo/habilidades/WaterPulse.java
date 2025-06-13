package br.inatel.cdg.jogo.habilidades;
import br.inatel.cdg.jogo.tipo.Agua;
public class WaterPulse extends Habilidade {
    public WaterPulse() {
        super("Water Pulse",60, 100, 20);
        this.tipo = new Agua();
    }
}
