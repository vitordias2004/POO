package br.inatel.cdg.jogo.habilidades;
import br.inatel.cdg.jogo.tipo.Agua;
public class HydroPump extends Habilidade {
    public HydroPump() {
        super("Hydro Pump", 110, 80, 5);
        this.tipo = new Agua();
    }
}
